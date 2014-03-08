package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 전화번호 관리 프로그램
 * @author JiHong Jang
 * @since 2014.03.03
 * @version 0.2
 */

public class Phone {
    private static BufferedReader in;

    static {
        in = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        List<PhoneInfo> phoneInfoList = new ArrayList<>();
        int choice = 0;

        while(true) {
            menu();
            System.out.print("선택 : ");
            try {
                choice = Integer.parseInt(in.readLine());
            } catch (NumberFormatException | IOException e) {
                System.out.println("1 ~5 사이의 숫자를 입력하세요");
            }

            switch (choice) {
                case 1:
                    addPhoneInfo(phone, phoneInfoList);
                    break;
                case 2:
                    searchPhoneInfo(phone, phoneInfoList);
                    break;
                case 3:
                    deletePhoneInfo(phone, phoneInfoList);
                    break;
                case 4:
                    showAllPhoneInfo(phoneInfoList);
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("1 ~ 5 사이의 값을 입력하세요");
                    break;
            }
        }

    }

    private static void showAllPhoneInfo(List<PhoneInfo> phoneInfoList) {
        for(PhoneInfo info : phoneInfoList) {
            System.out.println(info);
        }
    }

    private static void deletePhoneInfo(Phone phone, List<PhoneInfo> phoneInfoList) {
        System.out.println("데이터 삭제를 시작합니다. ");
        try {
            PhoneInfo phoneInfo = phone.inputName();
            int getIndex = findByName(phoneInfoList, phoneInfo);

            if(getIndex != -1) {
                phoneInfoList.remove(getIndex);
                System.out.println("삭제되었습니다.");
            } else {
                System.out.println("삭제하려는 데이터가 없습니다 .");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void searchPhoneInfo(Phone phone, List<PhoneInfo> phoneInfoList) {
        System.out.println("데이터 검색을 시작합니다. ");

        try{
            PhoneInfo phoneInfo = phone.inputName();
            int getIndex = findByName(phoneInfoList, phoneInfo);

            if(getIndex != -1) {
                System.out.println("이름 : " + phoneInfoList.get(getIndex).getName());
                System.out.println("전화번호 : " + phoneInfoList.get(getIndex).getPhoneNumber());
            } else {
                System.out.println("찾으시는 데이터가 없습니다. ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addPhoneInfo(Phone phone, List<PhoneInfo> phoneInfoList) {
        System.out.println("데이터 입력을 시작합니다. ");
        PhoneInfo phoneInfo;
        try {
            phoneInfo = phone.inputNameAndPhoneNumber();
            phoneInfoList.add(phoneInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static int findByName(List<PhoneInfo> phoneInfoList, PhoneInfo phoneInfo) {
        int getIndex = -1;
        for(int i = 0, length = phoneInfoList.size(); i < length; i++) {
            if(phoneInfo.getName() != null && !phoneInfo.getName().isEmpty() && phoneInfoList.get(i).getName().equals(phoneInfo.getName())) {
                getIndex = i;
                return getIndex;
            }

        }
        return getIndex;
    }

    private PhoneInfo inputNameAndPhoneNumber() throws IOException {
        String name;
        String phoneNumber;

        System.out.print("이름 : ");
        name = in.readLine();
        System.out.print("전화번호 : ");
        phoneNumber = in.readLine();

        return new PhoneInfo(name, phoneNumber);
    }

    private PhoneInfo inputName() throws IOException {
        String name;

        System.out.print("이름 : ");
        name = in.readLine();

        return new PhoneInfo(name);
    }

    public static void menu() {
        System.out.println("선택하세요");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 모든 데이터 출력");
        System.out.println("5. 프로그램 종료");
    }
}


class PhoneInfo {
    private String name;
    private String phoneNumber;
    private String birthday;

    public PhoneInfo(String name, String phoneNumber, String birthday) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    public PhoneInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public PhoneInfo(String name) {
        this.name = name;
    }
    
    public PhoneInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "name = " + this.name + "\n" +
               "phoneNumber = " + this.phoneNumber + "\n" +
               "birthday = " + this.birthday;
    }
}