package org.kevoree.modeling.action;

import org.kevoree.resolver.MavenResolver;

import java.io.File;
import java.util.HashSet;

/**
 * Created by duke on 7/17/14.
 */
public class KMFCompilerResolver {

    private static MavenResolver resolver = new MavenResolver();

    private static File resolved = null;

    private static File resolvedFmw = null;

    private static Object lock = new Object();

    public static File resolveCompiler(String version) {
        synchronized (lock) {
            if (resolved == null) {
                HashSet<String> urls = new HashSet<String>();
                urls.add("http://repo1.maven.org/maven2/");
                resolved = resolver.resolve("mvn:org.kevoree.modeling:org.kevoree.modeling.generator.standalone:" + version, urls);
            }
            return resolved;
        }
    }

    public static File resolveMicroFramework(String version) {
        synchronized (lock) {
            if (resolvedFmw == null) {
                HashSet<String> urls = new HashSet<String>();
                urls.add("http://repo1.maven.org/maven2/");
                resolvedFmw = resolver.resolve("mvn:org.kevoree.modeling:org.kevoree.modeling.microframework:" + version, urls);
            }
            return resolvedFmw;
        }
    }

}
