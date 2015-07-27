//KMF_VERSION=3.0.0
//VERSION=3.0.0

@version 4.4
@kmfVErsion 5.0

class p.TypeDefinition {

    att name: String with index, precision 5, foo 12

    @contained
    properties : p.Property[0,*]
}

class p.ComponentType : p.TypeDefinition {
    portNumber : Int
}

class p.Property {
    @id
    name : String
    value : String

    func myFunction(p : String, p : p.Property) : String
}

enum TITI {
GMGLMG, Mglglmgk, mgkgmlgkmlk,
mmm,
}



@version 4.4
@kmfVErsion 5.0



