package org.kevoree.modeling.idea.ide;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.codeInsight.lookup.LookupElementWeigher;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;
import org.kevoree.modeling.MetaModelLanguage;
import org.kevoree.modeling.idea.psi.*;
import org.kevoree.modeling.util.PrimitiveTypes;

public class MetaModelCompletionContributor extends CompletionContributor {

    private void fillInsideClassDecl(CompletionResultSet resultSet) {
        resultSet.addElement(LookupElementBuilder.create("att "));
        resultSet.addElement(LookupElementBuilder.create("ref "));
        resultSet.addElement(LookupElementBuilder.create("ref* "));

        resultSet.addElement(LookupElementBuilder.create("dependency "));
        resultSet.addElement(LookupElementBuilder.create("input "));
        resultSet.addElement(LookupElementBuilder.create("output "));

        resultSet.addElement(LookupElementBuilder.create("inferWith "));
        resultSet.addElement(LookupElementBuilder.create("temporalResolution "));
        resultSet.addElement(LookupElementBuilder.create("temporalLimit "));
    }

    public MetaModelCompletionContributor() {

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(MetaModelTypes.IDENT).withLanguage(MetaModelLanguage.INSTANCE).afterLeaf(PlatformPatterns.psiElement(MetaModelTypes.COLON)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull final CompletionResultSet resultSet) {

                        if (parameters.getPosition().getParent() != null) {
                            if (parameters.getPosition().getParent().getParent() != null) {
                                if (parameters.getPosition().getParent().getParent() instanceof MetaModelAttributeDeclaration || parameters.getPosition().getParent().getParent() instanceof MetaModelOutputDeclaration) {
                                    //add all attributes
                                    for (PrimitiveTypes p : PrimitiveTypes.values()) {
                                        resultSet.addElement(LookupElementBuilder.create(p.toString()));
                                    }
                                    parameters.getOriginalFile().acceptChildren(new PsiElementVisitor() {
                                        @Override
                                        public void visitElement(PsiElement element) {
                                            if (element instanceof MetaModelDeclaration) {
                                                MetaModelDeclaration declaration = (MetaModelDeclaration) element;
                                                if (declaration.getEnumDeclaration() != null && declaration.getEnumDeclaration().getTypeDeclaration() != null) {
                                                    resultSet.addElement(LookupElementBuilder.create(declaration.getEnumDeclaration().getTypeDeclaration()));
                                                }
                                            }
                                            super.visitElement(element);
                                        }
                                    });
                                    resultSet.stopHere();
                                } else if (parameters.getPosition().getParent().getParent() instanceof MetaModelRelationDeclaration || parameters.getPosition().getParent().getParent() instanceof MetaModelDependencyDeclaration) {
                                    //add all know types
                                    parameters.getOriginalFile().acceptChildren(new PsiElementVisitor() {
                                        @Override
                                        public void visitElement(PsiElement element) {
                                            if (element instanceof MetaModelDeclaration) {
                                                MetaModelDeclaration declaration = (MetaModelDeclaration) element;
                                                if (declaration.getClassDeclaration() != null && declaration.getClassDeclaration().getTypeDeclaration() != null) {
                                                    resultSet.addElement(LookupElementBuilder.create(declaration.getClassDeclaration().getTypeDeclaration()));
                                                }
                                            }
                                            super.visitElement(element);
                                        }
                                    });
                                    resultSet.stopHere();
                                }
                            }
                        }
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).afterLeaf(PlatformPatterns.psiElement(MetaModelTypes.OPPOSITE)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("oppositeRefName "));
                        resultSet.stopHere();
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).afterLeaf(PlatformPatterns.psiElement(MetaModelTypes.BODY_CLOSE)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("class "));
                        resultSet.addElement(LookupElementBuilder.create("enum "));
                        resultSet.addElement(LookupElementBuilder.create("version \"1.0.0\" "));
                        resultSet.addElement(LookupElementBuilder.create("kmfVersion \"release\""));
                        resultSet.stopHere();
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {

                        if (parameters.getPosition().getParent() != null) {
                            if (parameters.getPosition().getParent() instanceof MetaModelDeclaration) {
                            } else if (parameters.getPosition().getParent() instanceof MetaModelFile) {
                                resultSet.addElement(LookupElementBuilder.create("class "));
                                resultSet.addElement(LookupElementBuilder.create("enum "));
                                resultSet.addElement(LookupElementBuilder.create("version \"1.0.0\""));
                                resultSet.addElement(LookupElementBuilder.create("kmfVersion \"release\""));
                                resultSet.stopHere();
                            }
                        }
                    }
                }
        );


        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).afterLeaf(PlatformPatterns.psiElement(MetaModelTypes.ATT)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("attName : "));
                        resultSet.stopHere();
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).afterLeaf(PlatformPatterns.psiElement(MetaModelTypes.REF)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("relationName : "));
                        resultSet.stopHere();
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).afterLeaf(PlatformPatterns.psiElement(MetaModelTypes.MREF)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("relationName : "));
                        resultSet.stopHere();
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).afterLeaf(PlatformPatterns.psiElement(MetaModelTypes.INFER_WITH)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("\"BinaryPerceptron\""));
                        resultSet.addElement(LookupElementBuilder.create("\"GaussianClassification\""));
                        resultSet.addElement(LookupElementBuilder.create("\"GaussianProfiler\""));
                        resultSet.addElement(LookupElementBuilder.create("\"KMeanCluster\""));
                        resultSet.addElement(LookupElementBuilder.create("\"LinearRegression\""));
                        resultSet.addElement(LookupElementBuilder.create("\"Winnow\""));
                        resultSet.stopHere();
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).afterLeaf(PlatformPatterns.psiElement(MetaModelTypes.DEPENDENCY)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("dependencyName : "));
                        resultSet.stopHere();
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).afterLeaf(PlatformPatterns.psiElement(MetaModelTypes.INPUT)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("inputName \"dependencyName.attName\" "));
                        resultSet.stopHere();
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).afterLeaf(PlatformPatterns.psiElement(MetaModelTypes.PRECISION)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("0.1"));
                        resultSet.stopHere();
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).afterLeaf(PlatformPatterns.psiElement(MetaModelTypes.OUTPUT)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("outputName : "));
                        resultSet.stopHere();
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).afterLeaf(PlatformPatterns.psiElement(MetaModelTypes.TEMPORAL_LIMIT)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("100000 //max 100000 will be kept in history"));
                        resultSet.stopHere();
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).afterLeaf(PlatformPatterns.psiElement(MetaModelTypes.TEMPORAL_RESOLUTION)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("86400000 //one value per day"));
                        resultSet.stopHere();
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).afterLeaf(PlatformPatterns.psiElement(MetaModelTypes.IDENT).withText("Continuous")),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("precision "));
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).afterLeaf(PlatformPatterns.psiElement(MetaModelTypes.IDENT)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {

                        if (parameters.getPosition().getParent() != null) {
                            PsiElement elem = parameters.getPosition().getParent();
                            if (elem.toString().contains("oppositeOf")) {
                                resultSet.addElement(LookupElementBuilder.create("oppositeOf"));
                            }
                        }
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).beforeLeaf(PlatformPatterns.psiElement(MetaModelTypes.ATT)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        fillInsideClassDecl(resultSet);
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).beforeLeaf(PlatformPatterns.psiElement(MetaModelTypes.REF)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        fillInsideClassDecl(resultSet);
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).beforeLeaf(PlatformPatterns.psiElement(MetaModelTypes.MREF)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        fillInsideClassDecl(resultSet);
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).beforeLeaf(PlatformPatterns.psiElement(MetaModelTypes.INFER_WITH)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        fillInsideClassDecl(resultSet);
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).beforeLeaf(PlatformPatterns.psiElement(MetaModelTypes.DEPENDENCY)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        fillInsideClassDecl(resultSet);
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).beforeLeaf(PlatformPatterns.psiElement(MetaModelTypes.INPUT)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        fillInsideClassDecl(resultSet);
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).beforeLeaf(PlatformPatterns.psiElement(MetaModelTypes.OUTPUT)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        fillInsideClassDecl(resultSet);
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).beforeLeaf(PlatformPatterns.psiElement(MetaModelTypes.TEMPORAL_LIMIT)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        fillInsideClassDecl(resultSet);
                    }
                }
        );


        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).beforeLeaf(PlatformPatterns.psiElement(MetaModelTypes.TEMPORAL_RESOLUTION)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        fillInsideClassDecl(resultSet);
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).beforeLeaf(PlatformPatterns.psiElement(MetaModelTypes.BODY_CLOSE)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        fillInsideClassDecl(resultSet);
                    }
                }
        );

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(MetaModelLanguage.INSTANCE).afterLeaf(PlatformPatterns.psiElement(MetaModelTypes.BODY_OPEN)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        fillInsideClassDecl(resultSet);
                    }
                }
        );


    }

}
