
module com.leroydev.userdaomodule {
    requires com.leroydev.entitymodule;
    requires com.leroydev.daomodule;
    provides com.leroydev.dao.Dao with com.leroydev.userdao.UserDao;
    exports com.leroydev.userdao;
}
