package TP_Exception;


class ExceptionGrand extends Exception
{
    int nb;
  ExceptionGrand(int  s)
    {
      super();
      nb=s;
    }
    public String message(){
        return "ExceptionGrand: 20 est trop grand pour ce programme";
    }
}
