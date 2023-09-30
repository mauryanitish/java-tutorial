class StaticBlockWithoutMain{
    static{
        //it is work only 1.6 v of previous
        System.out.println("is static method call");
        //this version show error
    }
}