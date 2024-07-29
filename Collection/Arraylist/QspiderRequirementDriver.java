package Collection.Arraylist;

import java.util.ArrayList;

public class QspiderRequirementDriver {
	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<Object>();
		
		a1.add(new QspiderRequirement("Yash", "CSE", 2024, 83));
		a1.add(new QspiderRequirement("Amit", "IT", 2023, 84));
		a1.add(new QspiderRequirement("Sharad", "ME", 2021, 86));
		a1.add(new QspiderRequirement("Rahul", "CSE", 2022, 87));
		a1.add(new QspiderRequirement("Sanket", "Civil", 2022, 84));
		a1.add(new QspiderRequirement("Ajay", "ETC", 2022, 87));
		a1.add(new QspiderRequirement("Ssakshi", "ETC", 2024, 84));
		a1.add(new QspiderRequirement("harman", "ETC", 2024, 87));
		a1.add(new QspiderRequirement("Saket", "CSE", 2019, 87));
		a1.add(new QspiderRequirement("Sanika", "ETC", 2024, 87));
		a1.add(new QspiderRequirement("Piyush", "CSE", 2024, 55));
		a1.add(new QspiderRequirement("Nachiket", "ETC", 2024, 62));
		a1.add(new QspiderRequirement("dasdsa", "ETC", 2023, 71));
		a1.add(new QspiderRequirement("fdgfd", "ETC", 2024, 45));
		a1.add(new QspiderRequirement("fdksf", "ETC", 2020, 74));
		a1.add(new QspiderRequirement("fsdkfsd", "CSE", 2024, 92));
		a1.add(new QspiderRequirement("fsdfms", "ME", 2021, 74));
		a1.add(new QspiderRequirement("rieur", "ETC", 2024, 74));
		a1.add(new QspiderRequirement("kf;sdf", "CSE", 2025, 51));
		a1.add(new QspiderRequirement("euqweia", "ETC", 2024, 35));
		a1.add(new QspiderRequirement("dadas", "ETC", 2024, 45));
		a1.add(new QspiderRequirement("fklsdjflk", "ETC", 2024, 90));
		a1.add(new QspiderRequirement("ajsdas", "ETC", 2027, 99));
		a1.add(new QspiderRequirement("dalks", "CSE", 2024, 74));
		a1.add(new QspiderRequirement("dasd", "ETC", 2024, 41));
		a1.add(new QspiderRequirement("gfodgk", "ME", 2024, 45));
		a1.add(new QspiderRequirement("asdas;", "ETC", 2024, 65));
		a1.add(new QspiderRequirement("nishadas", "ETC", 2024, 21));
		a1.add(new QspiderRequirement("nishaadasd", "CSE", 2022, 78));
		a1.add(new QspiderRequirement("daks", "ME", 2024, 80));
		a1.add(new QspiderRequirement("asdhas", "CSE", 2024, 70));
		a1.add(new QspiderRequirement("gysadgah", "ME", 2024, 78));
		
		for(Object o: a1)
		{
			QspiderRequirement q1=(QspiderRequirement)o;
			
			if(q1.getYop()>2023&& q1.getBranch()=="CSE")
			{
				System.out.println(q1.getName());
			}
			
		}
	}
}
