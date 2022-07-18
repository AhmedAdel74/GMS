package Project;

public class PackageFactory {

    IManagePackage packageFactory(int x) {
        
        switch(x){
            case 1:return new NewMemberPackage();
            case 2: return new UpdateMemberPackage();
        } 
        return null;
    }

}
