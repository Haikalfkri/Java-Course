// Sealed class is class that allow inheritance only class that have permits or permission
// and for the inheritance class should have final, sealed, or non-sealed parameters

sealed class A permits B,C {

}

sealed class B extends A permits D {

}

final class C extends A {

}

final class D extends B {

}


class SealedClass
{
    public static void main(String args[])
    {

    }
}