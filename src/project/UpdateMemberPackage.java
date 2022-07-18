package Project;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

public class UpdateMemberPackage implements IManagePackage{

    @Override
    public void managePackage(Variables variables) {
        Object selectValue = variables.packageComboBox.getSelectedItem();
        variables.packageField.setText((String) selectValue);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        int selected = variables.packageComboBox.getSelectedIndex();
        switch (selected) {
            case 0:
                Date newDate = DateUtils.addMonths(date, 1);

                variables.endDateField.setText(sdf.format(newDate));
                break;
            case 1:
                Date newDate1 = DateUtils.addMonths(date, 2);

                variables.endDateField.setText(sdf.format(newDate1));
                break;
            case 2:
                Date newDate2 = DateUtils.addMonths(date, 3);

                variables.endDateField.setText(sdf.format(newDate2));
                break;
            case 3:
                Date newDate3 = DateUtils.addMonths(date, 6);

                variables.endDateField.setText(sdf.format(newDate3));
                break;
            case 4:
                Date newDate4 = DateUtils.addMonths(date, 12);

                variables.endDateField.setText(sdf.format(newDate4));
                break;
        }

    }
    }
    

