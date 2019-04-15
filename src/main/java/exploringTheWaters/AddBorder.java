package exploringTheWaters;

public class AddBorder {

    String[] addBorder(String[] picture) {

        String [] picture2 = new String[picture.length+2];
        for(int i=0; i < picture.length;i++){
            picture2[i + 1] = "*" + picture[i] + "*";
        }
        picture2[picture.length+1] = picture2[1].replaceAll(".","*");
        picture2[0] = picture2[picture.length + 1];


        return picture2;



    }

}
