import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class INGNepal{
    private JFrame frame;
    private JPanel panel1; 
    private JPanel panel2;
    private JTextField VacancyNumberFld1;
    private JTextField DesignationFld1;
    private JTextField JobTypeFld1;
    private JTextField StaffNameFld1;
    private JTextField QualificationFld1;
    private JTextField JoiningDateFld1;
    private JTextField AppointedByFld1;
    private JTextField WorkingHoursFld1;
    private JTextField SalaryFld1;
    private JTextField VacancyNumberFld2;
    private JTextField DesignationFld2;
    private JTextField JobTypeFld2;
    private JTextField StaffNameFld2;
    private JTextField QualificationFld2;
    private JTextField JoiningDateFld2;
    private JTextField AppointedByFld2;
    private JTextField WorkingHoursFld2;
    private JTextField WagesPerHourFld2;
    private JTextField ShiftFld2;
    private JButton addfulltimeBttn;
    private JButton appointfulltimeBttn;
    private JButton addparttimeBttn;
    private JButton appointparttimeBttn;
    private JButton terminationBttn;
    private JButton displayBttn;
    private JButton clearBttn;
  
    ArrayList<StaffHire> list = new ArrayList <StaffHire> ();
    
    public INGNepal()
    {
        frame = new JFrame("INGNepal");//it makes a frame with title 'INGNepal.'
        frame.setSize(1000, 730);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        panel1 = new JPanel();
        frame.add(panel1);
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 400, 600);

        
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(450, 0, 400, 600);
        frame.add(panel2);
        
        JLabel FullTimeStaffHireLbl1 = new JLabel("FullTimeStaffHire");
        FullTimeStaffHireLbl1.setBounds(125, 20, 250, 20);
        panel1.add(FullTimeStaffHireLbl1);
         
        JLabel PartTimeStaffHireLbl2 = new JLabel("PartTimeStaffHire");
        PartTimeStaffHireLbl2.setBounds(125, 20, 250, 20);
        panel2.add(PartTimeStaffHireLbl2);
        
        JLabel DesignationLbl1 = new JLabel("Designation");
        DesignationLbl1.setBounds(50, 45, 200, 70);
        panel1.add(DesignationLbl1);
             
        JLabel JobTypeLbl1 = new JLabel("JobType");
        JobTypeLbl1.setBounds(50, 95, 200, 70);
        panel1.add(JobTypeLbl1);
        
        JLabel WorkingHoursLbl1 = new JLabel("WorkingHours");
        WorkingHoursLbl1.setBounds(50, 145, 200, 70);
        panel1.add(WorkingHoursLbl1);
        
        JLabel SalaryLbl1 = new JLabel("Salary");
        SalaryLbl1.setBounds(50, 195, 200, 70);
        panel1.add(SalaryLbl1);
        
        JLabel VacancyNumberLbl1 = new JLabel("VacancyNumber");
        VacancyNumberLbl1.setBounds(50, 245, 200, 70);
        panel1.add(VacancyNumberLbl1);
        
        JLabel StaffNameLbl1 = new JLabel("StaffName");
        StaffNameLbl1.setBounds(50, 295, 200, 70);
        panel1.add(StaffNameLbl1);
        
        JLabel QualificationLbl1 = new JLabel("Qualification");
        QualificationLbl1.setBounds(50, 395, 200, 70);
        panel1.add(QualificationLbl1);
        
        JLabel JoiningDateLbl1 = new JLabel("JoiningDate");
        JoiningDateLbl1.setBounds(50, 345, 200, 70);
        panel1.add(JoiningDateLbl1);
        
        JLabel AppointedByLbl1 = new JLabel("AppointedBy");
        AppointedByLbl1.setBounds(50, 445, 200, 70);
        panel1.add(AppointedByLbl1);
        

        DesignationFld1 = new JTextField(); 
        DesignationFld1.setBounds(200, 70, 160, 22);
        panel1.add(DesignationFld1);
        
        
        JobTypeFld1 = new JTextField();
        JobTypeFld1.setBounds(200, 120, 160, 22);
        panel1.add(JobTypeFld1);
        
        WorkingHoursFld1 = new JTextField();
        WorkingHoursFld1.setBounds(200, 170, 160, 22);
        panel1.add(WorkingHoursFld1);
        
        SalaryFld1 = new JTextField();
        SalaryFld1.setBounds(200, 220, 160, 22);
        panel1.add(SalaryFld1);
        
        VacancyNumberFld1 = new JTextField();
        VacancyNumberFld1.setBounds(200, 270, 160, 22);
        panel1.add(VacancyNumberFld1);
        
        StaffNameFld1 = new JTextField();
        StaffNameFld1.setBounds(200, 320, 160, 22);
        panel1.add(StaffNameFld1);
        
        QualificationFld1 = new JTextField();
        QualificationFld1.setBounds(200, 420, 160, 22);
        panel1.add(QualificationFld1);
        
        JoiningDateFld1 = new JTextField();
        JoiningDateFld1.setBounds(200, 370, 160, 22);
        panel1.add(JoiningDateFld1);
        
        AppointedByFld1 = new JTextField();
        AppointedByFld1.setBounds(200, 470, 160, 22);
        panel1.add(AppointedByFld1);
        
            
        JLabel DesignationLbl2 = new JLabel("Designation");
        DesignationLbl2.setBounds(50, 45, 200, 70);
        panel2.add(DesignationLbl2);
              
        JLabel JobTypeLbl2 = new JLabel("JobType");
        JobTypeLbl2.setBounds(50, 95, 200, 70);
        panel2.add(JobTypeLbl2);
        
        JLabel WorkingHoursLbl2 = new JLabel("WorkingHours");
        WorkingHoursLbl2.setBounds(50, 145, 200, 70);
        panel2.add(WorkingHoursLbl2);
        
        JLabel WagesPerHourLbl2 = new JLabel("WagesPerHour");
        WagesPerHourLbl2.setBounds(50, 195, 200, 70);
        panel2.add(WagesPerHourLbl2);
        
        JLabel ShiftLbl2 = new JLabel("Shift");
        ShiftLbl2.setBounds(50, 245, 200, 70);
        panel2.add(ShiftLbl2);
        
        JLabel VacancyNumberLbl2 = new JLabel("VacancyNumber");
        VacancyNumberLbl2.setBounds(50, 295, 200, 70);
        panel2.add(VacancyNumberLbl2);
        
        JLabel StaffNameLbl2 = new JLabel("StaffName");
        StaffNameLbl2.setBounds(50, 345, 200, 70);
        panel2.add(StaffNameLbl2);
        
        JLabel JoiningDateLbl2 = new JLabel("JoiningDate");
        JoiningDateLbl2.setBounds(50, 395, 200, 70);
        panel2.add(JoiningDateLbl2);
        
        JLabel QualificationLbl2 = new JLabel("Qualification");
        QualificationLbl2.setBounds(50, 445, 200, 70);
        panel2.add(QualificationLbl2);
        
        JLabel AppointedByLbl2 = new JLabel("AppointedBy");
        AppointedByLbl2.setBounds(50, 495, 200, 70);
        panel2.add(AppointedByLbl2);
        
     
        DesignationFld2 = new JTextField();
        DesignationFld2.setBounds(200, 70, 160, 22);
        panel2.add(DesignationFld2);
      
        JobTypeFld2 = new JTextField();
        JobTypeFld2.setBounds(200, 120, 160, 22);
        panel2.add(JobTypeFld2);
        
        WorkingHoursFld2 = new JTextField();
        WorkingHoursFld2.setBounds(200, 170, 160, 22);
        panel2.add(WorkingHoursFld2);
        
        WagesPerHourFld2 = new JTextField();
        WagesPerHourFld2.setBounds(200, 220, 160, 22);
        panel2.add(WagesPerHourFld2);
        
        ShiftFld2 = new JTextField();
        ShiftFld2.setBounds(200, 270, 160, 22);
        panel2.add(ShiftFld2);
        
        VacancyNumberFld2 = new JTextField();
        VacancyNumberFld2.setBounds(200, 320, 160, 22);
        panel2.add(VacancyNumberFld2);
        
        StaffNameFld2 = new JTextField();
        StaffNameFld2.setBounds(200, 370, 160, 22);
        panel2.add(StaffNameFld2);
        
        JoiningDateFld2 = new JTextField();
        JoiningDateFld2.setBounds(200, 420, 160, 22);
        panel2.add(JoiningDateFld2);
        
        QualificationFld2 = new JTextField();
        QualificationFld2.setBounds(200, 470, 160, 22);
        panel2.add(QualificationFld2);
        
        AppointedByFld2 = new JTextField();
        AppointedByFld2.setBounds(200, 520, 160, 22);
        panel2.add(AppointedByFld2);
       
      
        
        addfulltimeBttn = new JButton("Add FullTimeStaff");
        addfulltimeBttn.setBounds(50, 600, 200, 30);
        addfulltimeBttn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                addvacancyFullTimeStaff();
            }
        });
        frame.add(addfulltimeBttn);
        
        appointfulltimeBttn = new JButton("Appoint FullTimeStaff");
        appointfulltimeBttn.setBounds(50, 650, 200, 30);
        appointfulltimeBttn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                appointFullTimeStaff();
            }
        });
        frame.add(appointfulltimeBttn);
        
        displayBttn = new JButton("Display");
        displayBttn.setBounds(400, 600, 80, 30);
        displayBttn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                display();
            }
        });
        frame.add(displayBttn);
        
        clearBttn= new JButton("Clear");
        clearBttn.setBounds(400, 650, 80, 30);
        clearBttn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                clear();
            }
        });
        frame.add(clearBttn);
        
        
        addparttimeBttn = new JButton("Add PartTimeStaff");
        addparttimeBttn.setBounds(550, 600, 200, 30);
        addparttimeBttn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                addvacancyPartTimeStaff();
            }
        });
        frame.add(addparttimeBttn);
        
        appointparttimeBttn = new JButton("Appoint PartTimeStaff");
        appointparttimeBttn.setBounds(550, 650, 200, 30);
        appointparttimeBttn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                appointPartTimeStaff();
            }
        });
        frame.add(appointparttimeBttn);
        
        
        terminationBttn = new JButton("Terminate");
        terminationBttn.setBounds(785, 600, 150, 30);
        terminationBttn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                terminationPartTimeStaff();
            }
        });
        frame.add(terminationBttn);
        
        
    }
    
    public void clear()
    {
        JOptionPane.showMessageDialog(frame,"Cleared","Info",(1));
        //TextField for FullTimeStaffHire Panel
        DesignationFld1.setText(null);
        VacancyNumberFld1.setText(null);
        SalaryFld1.setText(null);
        StaffNameFld1.setText(null);
        QualificationFld1.setText(null);
        JoiningDateFld1.setText(null);
        AppointedByFld1.setText(null);
        WorkingHoursFld1.setText(null);
        JobTypeFld1.setText(null);
        
        //TextField for PartTimeStaffHire Panel2
        DesignationFld2.setText(null);
        VacancyNumberFld2.setText(null);
        ShiftFld2.setText(null);
        StaffNameFld2.setText(null);
        QualificationFld2.setText(null);
        JoiningDateFld2.setText(null);
        AppointedByFld2.setText(null);
        WorkingHoursFld2.setText(null);
        JobTypeFld2.setText(null);
        WagesPerHourFld2.setText(null);
        
    }
    
    public void addvacancyFullTimeStaff()
    {
         if(VacancyNumberFld1.getText().isEmpty() || SalaryFld1.getText().isEmpty() ||WorkingHoursFld1.getText().isEmpty())
         {
             JOptionPane.showMessageDialog(frame, " Please fill the required Fields.", "Error", JOptionPane.ERROR_MESSAGE);
         
         }
         else{
             String VacancyNumber1 = VacancyNumberFld1.getText();
             String Salary1 = SalaryFld1.getText();
             String WorkingHours1 = WorkingHoursFld1.getText();
             String JobType1 = JobTypeFld1.getText();
             String Designation1 = DesignationFld1.getText();
             int VacancyNumber, Salary, WorkingHours;
    
            try
             {
                 VacancyNumber = Integer.parseInt(VacancyNumber1);
                 Salary = Integer.parseInt(Salary1);
                 WorkingHours = Integer.parseInt(WorkingHours1);
             }
             catch(NumberFormatException ne)
             {
                 JOptionPane.showMessageDialog(frame, " Please enter the fields in correct format.", "Error", JOptionPane.ERROR_MESSAGE);
                 return;
             }
            for(StaffHire staffList : list)
            {
                if(staffList instanceof FullTimeStaffHire)
                {
                    FullTimeStaffHire fullTimestaff = (FullTimeStaffHire) staffList;
                    if (fullTimestaff.getVacancyNumber() == VacancyNumber)
                    {
                        JOptionPane.showMessageDialog(frame, "Vacancy Number is already added", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }
            FullTimeStaffHire fullTimeList = new FullTimeStaffHire(VacancyNumber,Designation1, JobType1, Salary, WorkingHours);
            list.add(fullTimeList);
            JOptionPane.showMessageDialog(frame,"VacancyNumber="+VacancyNumber+"\nJobType="+JobType1+"\nWorkingHours="+WorkingHours1+"\nDesignation="+Designation1+"\nSalary="+Salary1+
            "\n"+"\nVacancy Successfully added for FullTimeStaff", "Successfull",JOptionPane.INFORMATION_MESSAGE);
         }
    }

    public void appointFullTimeStaff()
    {
        if(VacancyNumberFld1.getText().isEmpty() || StaffNameFld1.getText().isEmpty() ||JoiningDateFld1.getText().isEmpty() ||AppointedByFld1.getText().isEmpty() ||QualificationFld1.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(frame, " Please fill the required Fields.", "Error", JOptionPane.ERROR_MESSAGE);
        
        }
        else{
            String VacancyNumber1 = VacancyNumberFld1.getText();
            String StaffName1 = StaffNameFld1.getText();
            String JoiningDate1 = JoiningDateFld1.getText();
            String Qualification1 = QualificationFld1.getText();
            String AppointedBy1 = AppointedByFld1.getText();
            int VacancyNumber;
    
            try{
                VacancyNumber = Integer.parseInt(VacancyNumber1);
            }
            catch(NumberFormatException ne)
            {
                JOptionPane.showMessageDialog(frame, " Please enter the fields in correct Formate.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            boolean found = false;
            for(int i = 0; i < list.size(); ++i)
            {
                StaffHire staffList = list.get(i);
                if(staffList instanceof FullTimeStaffHire)
                {
                    FullTimeStaffHire fullTimestaff = (FullTimeStaffHire) staffList;
                    if (fullTimestaff.getVacancyNumber() == VacancyNumber)
                    {
                        found = true;
                        if(fullTimestaff.getJoined() == true)
                        {
                            JOptionPane.showMessageDialog(frame, "Staff is already appointed", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        else
                        {
                            fullTimestaff.hireFullTimeStaff(StaffName1, JoiningDate1, Qualification1, AppointedBy1);
                            JOptionPane.showMessageDialog(frame, "Staff is appointed successfully.","Successfull", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
            if(found == false)
            {
                JOptionPane.showMessageDialog(frame, "Vacancy is not added. First add the Vacancy", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }

    public void display()
    {
        boolean show = false;
            for (StaffHire SH : list)
            {
                show = true;
                SH.display();
            }
        
            if (show == false)
            {
                JOptionPane.showMessageDialog(frame,"Vacancy Number not found","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        
    }

    public void addvacancyPartTimeStaff()
    {
        if(VacancyNumberFld2.getText().isEmpty() || WagesPerHourFld2.getText().isEmpty() ||WorkingHoursFld2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(frame, " Please fill the required Fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String VacancyNumber2 = VacancyNumberFld2.getText();
            String WorkingHours2 = WorkingHoursFld2.getText();
            String Shift2 = ShiftFld2.getText();
            String JobType2 = JobTypeFld2.getText();
            String Designation2 = DesignationFld2.getText();
            String WagesPerHour2 = WagesPerHourFld2.getText();
            int VacancyNumber, WagesPerHour, WorkingHours;
     
            try
            {
                VacancyNumber = Integer.parseInt(VacancyNumber2);
                WagesPerHour = Integer.parseInt(WagesPerHour2);
                WorkingHours = Integer.parseInt(WorkingHours2);
            }
            catch(NumberFormatException ne)
            {
                JOptionPane.showMessageDialog(frame, " Please enter the fields in correct Formate.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            for(StaffHire staffList : list)
            {
                if(staffList instanceof PartTimeStaffHire)
                {
                    PartTimeStaffHire partTimestaff = (PartTimeStaffHire) staffList;
                    if (partTimestaff.getVacancyNumber() == VacancyNumber)
                    {
                        JOptionPane.showMessageDialog(frame, "VacancyNumber is already added", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }
            PartTimeStaffHire partTimeList = new PartTimeStaffHire(VacancyNumber,Designation2, JobType2,  WorkingHours, WagesPerHour, Shift2);
            list.add(partTimeList);
            JOptionPane.showMessageDialog(frame,"VacancyNumber="+VacancyNumber+"\nJobType="+JobType2+"\nWorkingHours="+WorkingHours+"\nDesignation="+Designation2+"\nWagesPerHour="+WagesPerHour+"\nShift="+Shift2+
            "\n"+"\nVacancy Successfully added for PartTimeStaff", "Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void appointPartTimeStaff()
    {
        if(VacancyNumberFld2.getText().isEmpty() || StaffNameFld2.getText().isEmpty() || JoiningDateFld2.getText().isEmpty() || AppointedByFld2.getText().isEmpty() || QualificationFld2.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(frame, "  Please fill the required Fields.", "Error", JOptionPane.ERROR_MESSAGE);
        
        }
        else{
            String VacancyNumber2 = VacancyNumberFld2.getText();
            String StaffName2 = StaffNameFld2.getText();
            String JoiningDate2 = JoiningDateFld2.getText();
            String Qualification2 = QualificationFld2.getText();
            String AppointedBy2 = AppointedByFld2.getText();
            int VacancyNumber;
 
            try{
                VacancyNumber = Integer.parseInt(VacancyNumber2);
            }
            catch(NumberFormatException ne)
            {
                JOptionPane.showMessageDialog(frame, " Please enter the fields in correct Formate.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            boolean found = false;
            for(int i = 0; i < list.size(); ++i)
            {
                StaffHire staffList = list.get(i);
                if(staffList instanceof PartTimeStaffHire)
                {
                    PartTimeStaffHire partTimestaff = (PartTimeStaffHire) staffList;
                    if (partTimestaff.getVacancyNumber() == VacancyNumber)
                    {
                        found = true;
                        if(partTimestaff.getjoined() == true)
                        {
                            JOptionPane.showMessageDialog(frame, "Staff is already appointed", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        else{
                            partTimestaff.HirePartTimeStaff(StaffName2, JoiningDate2, Qualification2, AppointedBy2);
                            JOptionPane.showMessageDialog(frame, "Staff is appointed successfully.","Successfull", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
            if(found == false)
            {
                JOptionPane.showMessageDialog(frame, "Vacancy is not added. First add the Vacancy", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }

    public void terminationPartTimeStaff()
    {
        String VacancyNumber2 = JOptionPane.showInputDialog(frame,"VacancyNumber", "Terminate", 3);
        int VacancyNumber;
        try{
            if(VacancyNumber2.trim().equals(""))
            {
                JOptionPane.showMessageDialog(frame,"Please enter VacancyNumber", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        catch (NullPointerException ne)
        {
            
            return;
        }
        
        try{
            VacancyNumber = Integer.parseInt(VacancyNumber2);
        }
        catch (NumberFormatException ne)
        {
            JOptionPane.showMessageDialog(frame, "Please enter number the field in correct Format.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean found = false ;
        for(StaffHire staffList : list)
        {
            if(staffList instanceof PartTimeStaffHire)
            {
                PartTimeStaffHire partTimestaff = (PartTimeStaffHire) staffList;
                if (partTimestaff.getVacancyNumber() == VacancyNumber)
                {
                    found = true;
                    partTimestaff.stafftermination();
                    list.remove(partTimestaff);
                    JOptionPane.showMessageDialog(frame, "The staff is terminated successfully", "Termined", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        }
        if (found == false)
        {
            JOptionPane.showMessageDialog(frame, "VacancyNumber is not found", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    public static void main(String[]args)
    {
        new INGNepal().frame.setVisible(true);

        
    }
}
