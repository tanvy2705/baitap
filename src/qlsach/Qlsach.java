package qlsach;

import java.util.ArrayList;

public class Qlsach {
    private ArrayList<Sach> book;
    public Qlsach() {
        book=new ArrayList<>();
    }
    public void xoaSach(String id){
        boolean timthay=false;
        for(int i=0;i<book.size();i++){
            if(book.get(i).getId().equals(id)){
                timthay=true;
                break;
            }
        }
       if(timthay){
           System.out.println("khong tim thay sach co ID: "+id);
       }
    }
    public void themsach( Sach sachs) {
        book.add(sachs);
    }
    public void suasach(String id,String tensach,String tentacgia,String tennxb) {
        for (int i=0;i<book.size();i++) {
            Sach s=book.get(i);
            if (s.getId().equals(id)) {
                s.setTensach(tensach);
                s.setTentacgia(tentacgia);
                s.setTennxb(tennxb);
            }

        }


    }
    public void hienthi() {
        if (book.isEmpty()) {
            System.out.println("khong co danh sach");


        }else {
            for (Sach s:book) {
                System.out.println(s);
            }

        }
    }



}

