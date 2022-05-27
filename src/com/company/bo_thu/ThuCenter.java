package com.company.bo_thu;

import java.util.*;

public class ThuCenter {
    private ArrayList<Thu>thus;
    private static ThuCenter thuCenter;
    private String searching;
    private boolean search;

    public static ThuCenter initialize(){
        if(thuCenter==null){
          thuCenter = new ThuCenter();
        }
        return thuCenter;
    }
    public void data(){
        search = false;
        DataKanji dataKanji = DataKanji.getInstance();
        System.out.println("Search[s] Or Play[p]");
        String pre_request;
        do{
            System.out.println("If you press wrong code, do it again");
            pre_request = (new Scanner(System.in).nextLine());
        }while (!pre_request.equals("p")&&!pre_request.equals("s"));
        if(pre_request.equals("p")){
            ClearConsole();
            System.out.println("Which set you wanna play  ? [1]/[2]/[3]/[4]/[5]/[6]/[7]/[8]/[9]/[10]/[11]/[12] any key for overall test");
            String request = (new Scanner(System.in).nextLine());
            if(request.trim().equals("1")){
                thus = dataKanji.NihonGrade1();
            }else if(request.trim().equals("2")){
                thus = dataKanji.NihonGrade2();
            }else if(request.trim().equals("3")){
                thus = dataKanji.NihonGrade3();
            }else if(request.trim().equals("4")){
                thus = dataKanji.NihonGrade4();
            }else if(request.trim().equals("5")){
                thus = dataKanji.NihonGrade5();
            }else if(request.trim().equals("6")){
                thus = dataKanji.NihonGrade6();
            }else if(request.trim().equals("7")){
                thus = dataKanji.NihonGrade7();
            }else if(request.trim().equals("8")){
                thus = dataKanji.NihonGrade8();
            }else if(request.trim().equals("9")){
                thus = dataKanji.NihonGrade9();
            }else if(request.trim().equals("10")){
                thus = dataKanji.Nihongrade10();
            }else if(request.trim().equals("11")){
                thus = dataKanji.Nihongrade11();
            }else if(request.trim().equals("12")){
                thus = dataKanji.Nihongrade12();
            }
            else {
                thus = dataKanji.NihonAllGrade();
            }
        }else {
            ClearConsole();
            search = true;
            System.out.println("Form[日/Nhật/mặt trời] : enter your word to search");
            searching = (new Scanner(System.in).nextLine()).trim();
            thus = dataKanji.NihonAllGrade();
        }
    }
    public static void ClearConsole(){
        try{
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system

            if(operatingSystem.contains("Windows")){
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void checkQuestion(String request,ArrayList<Thu>ans,String use_ans){
        if(!use_ans.contains(",")){
            System.out.println("Wrong answer !");
            return;
        }
        String[]words = use_ans.trim().split(",");
        int count = 0;
        switch (request){
            case "q":
                for(Thu thu:ans){
                    if(thu.getWay_to_write().equals(words[count])){
                        System.out.println("True : "+thu.getWay_to_write()+"\t\t");
                    }else {
                        System.out.println("False : "+words[count]+" ("+thu.getWay_to_write()+")"+"\t\t");
                    }
                    count++;
                }
                break;
            case "a":
                for(Thu thu:ans){
                    if(thu.getName_han().equals(words[count])){
                        System.out.println("True : "+thu.getName_han()+"\t\t");
                    }else {
                        System.out.println("False : "+words[count]+" ("+thu.getName_han()+")"+"\t\t");
                    }
                    count++;
                }
                break;
            default:
                break;
        }
    }
    public void showOff(){
        if(!search){
            System.out.println("Set : "+thus.size()+" words");
            System.out.println("Type of question : [q] vietnamese/ [a] kanji");
            String request = (new Scanner(System.in).nextLine());
            ArrayList<Thu> ans = shuffleList(thus);
            int count = 0;
            if(request.equals("q")){
                String []guideline = new String[ans.size()];
                for (Thu thu:ans) {
                    guideline[count] = thu.getWay_to_write();
                    System.out.print(thu.getName_han()+"\t\t");
                    count++;
                }
                String []getShuffleAns = shuffleStringArray(guideline);
                System.out.println("Prepared ?");
                String guildYet = new Scanner(System.in).nextLine();
                if(guildYet!=null){
                    System.out.println("\n Guide : ");
                    for (int i = 0; i < getShuffleAns.length; i++) {
                        if(i!=0){
                            System.out.print(","+getShuffleAns[i]);
                        }else {
                            System.out.print(getShuffleAns[i]);
                        }
                    }
                    System.out.println("\n Enter the arranged number below:\n");
                    System.out.println("answer yet ? (The answer is seperated by ',' )");
                    String answer = new Scanner(System.in).nextLine();
                    if(answer!=null){
                        String[]numberIndex = answer.trim().split(",");
                        String ansTranslate = "";
                        for (int i = 0; i < numberIndex.length; i++) {
                            if(i!=0){
                                ansTranslate+=",";
                            }
                            ansTranslate += getShuffleAns[Integer.parseInt(numberIndex[i])-1];
                        }
                        System.out.println(ansTranslate);
                        checkQuestion("q",ans,ansTranslate);
                    }
                }
            }else if(request.equals("a")){
                for (Thu thu:ans) {
                    System.out.println(thu.getWay_to_write());
                }
                System.out.println("answer yet ? (The answer is seperated by ',' )");
                String answer = new Scanner(System.in).nextLine();
                if(answer!=null){
                    checkQuestion("a",ans,answer);
                }
            }else {
                System.out.println("Okay wrong answer !");
            }
        }else {
            search = false;
            for (Thu thu:thus) {
                if(searching.equals(thu.getWay_to_write())||searching.equals(thu.getName_han())||searching.equals(thu.getMeaning())){
                    System.out.println("-------------Item was found------------");
                    System.out.println("(ID : "+thus.indexOf(thu)+")"+thu.toString());
                    if(thu.isThereAnyContained()){
                        thu.showContainer();
                    }
                }
            }
        }
    }
    public String[]shuffleStringArray(String[]intArray){
        List<String> intList = Arrays.asList(intArray);
        Collections.shuffle(intList);
        return intList.toArray(intArray);
    }
    public ArrayList<Thu> shuffleList(ArrayList<Thu>thus){
        int limit = thus.size();
        int []index_shuffle = new int[limit];
        int count = 0;
        while (count < limit){
            index_shuffle[count]=count;
            count++;
        }
        for (int i = 0; i < thus.size(); i++) {
            int randomIndex = new Random().nextInt(thus.size()-1);
            int temp = index_shuffle[randomIndex];
            index_shuffle[randomIndex] = index_shuffle[i];
            index_shuffle[i] = temp;
        }
        ArrayList<Thu>transferred = new ArrayList<>();
        for (int i = 0; i < thus.size(); i++) {
            transferred.add(thus.get(index_shuffle[i]));
        }
        return transferred;
    }
}
