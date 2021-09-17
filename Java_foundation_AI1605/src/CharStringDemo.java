public class CharStringDemo {
    public static void main(String[] args){
        char[] arrChars = new char[] {'a', 'b', 'c'};
        System.out.println(arrChars);
        
        for (int i = 0; i < arrChars.length; i++){
            System.out.println(i + ": " + arrChars[i]);
        }
        
        String s2 = new String(arrChars);
        System.out.println("Value of s2: " + s2);
        
        String s3 = new String (new char[] {'a', 'b', 'c'});
        System.out.println("Value of s3: " + s3);
        
        // yeu cau tao mot chuoi ki tu, tien hanh thong ke xem trong chuoi do cac nguyen am xuat hien voi tan suat nhu the nao
        // dinh dang la a(m) e(n) i(k) o(l) u(x)
        // vi du:Ha noi mua thu
        // thi output la a(2) e(0) i(1) o(1) u(2)
        
        // yeu cau: nhap vao mot chuoi ky tu do dai khong qua 100 ki tu
        // tien hanh thong ke tan suat xuat hiien cua cac tu (words), khong phan biet chu hoa/ chu thuong, va khong tinh cac dau cau di kem
        // vi du: Hello Java World. Java is powerful. I love Java so much.
        // thi output la Java(3) hello(1) is(1) powerful(1) love(1) so(1) much(1)
        // thu tap sap xep theo hai tieu chi: tan suat xuat hien giam dan, neu cung tan xuat thii theo alphabet tang dan (A-Z)
        //                                    theo thu tu alphabet theo chieu tang dan: (A-Z)
    }
}
