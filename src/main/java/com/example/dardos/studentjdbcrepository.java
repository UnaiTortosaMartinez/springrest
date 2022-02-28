package com.example.dardos;

public class studentjdbcrepository  implements rowmapper < student > {
    @override
    public student maprow(resultset rs, int rownum) throws sqlexception {
        student student = new student();
        student.setid(rs.getlong("id"));
        student.setname(rs.getstring("name"));
        student.setpassportnumber(rs.getstring("passport_number"));
        return student;
    }

}

public list < student > findall() {
    return jdbctemplate.query("select * from student", new studentrowmapper());
}
public int deletebyid(long id) {
    return jdbctemplate.update("delete from student where id=?", new object[] {
        id
    });
}

public int insert(student student) {
    return jdbctemplate.update("insert into student (id, name, passport_number) " + "values(?,  ?, ?)",
        new object[] {
            student.getid(), student.getname(), student.getpassportnumber()
        });
}

public int update(student student) {
    return jdbctemplate.update("update student " + " set name = ?, passport_number = ? " + " where id = ?",
        new object[] {
            student.getname(), student.getpassportnumber(), student.getid()
        });
}
}