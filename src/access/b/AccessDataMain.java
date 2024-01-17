//package access.b;
//
//import access.a.AccessData;
//public class AccessInnerMain {
//    public static void main(String[] args) {
//        AccessData  data = new AccessData();
//        // public 호출 가능
//        data.publicFiled = 1;
//        data.publicMethod();
//
//        // default 호출 불가능 (다른 패키지의 default 멤버를 호출하였기 때문에)
////        data.defaultField = 2;
////        data.defaultMethod();
//
//        //private 호출 불가능
////        data.privateField = 3;
////        data.privateMethod();
//
//        // public 으로 선언된 멤버이기에 호출이 가능하다.
//        data.innerAccess();
//    }
//}
