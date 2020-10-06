package aula4.encapsulamento2;

public class Hora {
    private int horas, minutos, segundos;

    public static boolean HorasEValida(int horas)
    {
        return horas > -1 && horas < 24;
    }

    public static boolean MinutosEValido(int minutos)
    {
        return minutos > -1 && minutos < 60;
    }

    public static boolean SegundosEValido(int segundos)
    {
        return segundos > -1 && segundos < 60;
    }

    public static int DiferencaMinutos(Hora h1, Hora h2)
    {
        // Calcula o total de segundos em cada um dos horários
        int s1 = Integer.parseInt(h1.GetHoras()) * 3600
                    + Integer.parseInt(h1.GetMinutos()) * 60
                    + Integer.parseInt(h1.GetSegundos());
        int s2 = Integer.parseInt(h2.GetHoras()) * 3600
                    + Integer.parseInt(h2.GetMinutos()) * 60
                    + Integer.parseInt(h2.GetSegundos());
        
        // Calcula a diferença de horários e garante que ela seja positiva
        s1 = s1 > s2 ? s1 - s2 : s2 - s1;

        return s1 / 60;
    }

    public Hora(int horas)
    {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;

        SetHoras(horas);
    }

    public Hora(int horas, int minutos, int segundos)
    {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;

        SetHorario(horas, minutos, segundos);
    }

    public String GetHoras()
    {
        return Integer.toString(this.horas);
    }

    public void SetHoras(int horas)
    {
        if (Hora.HorasEValida(horas))
            this.horas = horas;
    }

    public String GetMinutos()
    {
        return Integer.toString(this.minutos);
    }

    public void SetMinutos(int minutos)
    {
        if (Hora.MinutosEValido(minutos))
            this.minutos = minutos;
    }

    public String GetSegundos()
    {
        return Integer.toString(this.segundos);
    }

    public void SetSegundos(int segundos)
    {
        if (Hora.SegundosEValido(segundos))
            this.segundos = segundos;
    }

    public String GetHorario()
    {
        return GetHoras() + ":" + GetMinutos() + ":" + GetSegundos();
    }

    public void SetHorario(int horas, int minutos, int segundos)
    {
        // Altera o horário apenas quando todas as entradas forem válidas
        if (Hora.HorasEValida(horas) && Hora.MinutosEValido(minutos) && Hora.SegundosEValido(segundos))
        {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }
}
