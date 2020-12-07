 class LabelExample {
     public static void main(String args[]) {
         Frame MyFrame = new Frame("Example");
         Label luser, lpass;
         luser = new Label("Username:");
         luser.setBounds(50, 100, 100, 30);
         lpass = new Label("Password:");
         lpass.setBounds(50, 150, 100, 30);
         MyFrame.add(luser);
         MyFrame.add(lpass);
         MyFrame.setSize(400, 400);
         MyFrame.setLayout(null);
         MyFrame.setVisible(true);
     }
 }
