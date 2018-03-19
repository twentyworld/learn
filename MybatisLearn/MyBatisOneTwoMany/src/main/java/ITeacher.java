public interface ITeacher {
    public Teacher queryOneTeacher(Long id);

    public Teacher queryOneTeacherWithStudent(Long id);

    public int insertOneTeacher(Teacher teacher);
}