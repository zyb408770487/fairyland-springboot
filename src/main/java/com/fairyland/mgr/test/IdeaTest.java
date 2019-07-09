package com.fairyland.mgr.test;

import org.apache.commons.lang3.StringUtils;

public class IdeaTest {
    private String userName;
    private String passWord;

    public IdeaTest() {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "IdeaTest{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
    public static void main(String[] args) {
         T t = new T();
        IdeaTest ideaTest = new IdeaTest();
        String passWord = ideaTest.getPassWord();
        if (StringUtils.isNotBlank(passWord)){
            ideaTest.setPassWord("admin");
        }
        ideaTest.setUserName("陈伟霆");
        String userName = ideaTest.getUserName();
        if (StringUtils.isNotBlank(userName)) {
            System.out.println("buweikong de qingkuang");
        }

        boolean equals = t.equals("11");
        System.out.println("equals");
        System.out.println();
    }
}
