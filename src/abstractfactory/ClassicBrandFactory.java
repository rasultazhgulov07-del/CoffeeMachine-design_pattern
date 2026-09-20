package abstractfactory;

public class ClassicBrandFactory implements ServingSetFactory{
        public Cup createCup(){
            return new ClassicCup();
        }
        public Lid createLid(){
            return new ClassicLid() ;
        }
        public Receipt createReceipt(){
            return new ClassicReceipt();
        }
}
