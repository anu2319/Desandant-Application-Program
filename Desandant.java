public class Desandant
{
  public static void main(String[] args)
  {
      ParentSon parent_son[] = new ParentSon[4];
      parent_son[0] = new ParentSon("Thasarathan","raman");
      parent_son[1] = new ParentSon("Thasarathan","lakshmanan");
      parent_son[2] = new ParentSon("raman","lavan");
      parent_son[3] = new ParentSon("raman","khusan");
      ParentSon.findDesandants("Thasarathan",2);
  }
}
