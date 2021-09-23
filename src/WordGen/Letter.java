package WordGen;

public class Letter
{
    private String emoji;
    private String blank;

    public Letter(String emoji, String blank)
    {
        this.emoji = emoji;
        this.blank = blank;
    }

    public void setEmoji(String emoji) { this.emoji = emoji; }
    public void setBlank(String blank) { this.blank = blank; }
    public String getEmoji() { return emoji; }
    public String getBlank() { return blank; }

    public String getLetter(int get)
    {
        switch(get)
        {
            case 0:
            {
                return A();
            }
            case 1:
            {
                return B();
            }
            case 2:
            {
                return C();
            }
            case 3:
            {
                return D();
            }
            case 4:
            {
                return E();
            }
            case 5:
            {
                return F();
            }
            case 6:
            {
                return G();

            }
            case 7:
            {
                return H();

            }
            case 8:
            {
                return I();

            }
            case 9:
            {
                return J();

            }
            case 10:
            {
                return K();

            }
            case 11:
            {
                return L();

            }
            case 12:
            {
                return M();

            }
            case 13:
            {
                return N();

            }
            case 14:
            {
                return O();

            }
            case 15:
            {
                return P();
            }
            case 16:
            {
                return Q();
            }
            case 17:
            {
                return R();
            }
            case 18:
            {
                return S();
            }
            case 19:
            {
                return T();
            }
            case 20:
            {
                return U();
            }
            case 21:
            {
                return V();
            }
            case 22:
            {
                return W();
            }
            case 23:
            {
                return X();
            }
            case 24:
            {
                return Y();
            }
            case 25:
            {
                return Z();
            }
        }
        return "";
    }

    public String A()
    {
        return  blank + blank + blank + emoji + blank + blank + blank + "\n" +
                blank + blank + emoji + blank + emoji + blank + blank + "\n" +
                blank + emoji + emoji + emoji + emoji + emoji + blank + "\n" +
                emoji + blank + blank + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + blank + blank + emoji;
    }
    public String B()
    {
        return  emoji + emoji + emoji + emoji + emoji + blank + "\n" +
                emoji + blank + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + blank + emoji + "\n" +
                emoji + emoji + emoji + emoji + emoji + blank + "\n" +
                emoji + blank + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + blank + emoji + "\n" +
                emoji + emoji + emoji + emoji + emoji;
    }
    public String C()
    {
        return  blank + blank + emoji + emoji + emoji + "\n" +
                blank + emoji + blank + blank + blank + "\n" +
                emoji + blank + blank + blank + blank + "\n" +
                emoji + blank + blank + blank + blank + "\n" +
                emoji + blank + blank + blank + blank + "\n" +
                blank + emoji + blank + blank + blank + "\n" +
                blank + blank + emoji + emoji + emoji;
    }
    public String D()
    {
        return  emoji + emoji + emoji + emoji + emoji + blank + "\n" +
                emoji + blank + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + blank + emoji + "\n" +
                emoji + emoji + emoji + emoji + emoji;
    }
    public String E()
    {
        return  emoji + emoji + emoji + emoji + emoji + "\n" +
                emoji + blank + blank + blank + blank + "\n" +
                emoji + blank + blank + blank + blank + "\n" +
                emoji + emoji + emoji + emoji + blank + "\n" +
                emoji + blank + blank + blank + blank + "\n" +
                emoji + blank + blank + blank + blank + "\n" +
                emoji + emoji + emoji + emoji + emoji;
    }

    public String F()
    {
        return  emoji + emoji + emoji + emoji + emoji + "\n" +
                emoji + blank + blank + blank + blank + "\n" +
                emoji + blank + blank + blank + blank + "\n" +
                emoji + emoji + emoji + emoji + blank + "\n" +
                emoji + blank + blank + blank + blank + "\n" +
                emoji + blank + blank + blank + blank + "\n" +
                emoji;
    }

    public String G()
    {
        return  emoji + emoji + emoji + emoji + emoji + "\n" +
                emoji + blank + blank + blank + blank + "\n" +
                emoji + blank + blank + blank + blank + "\n" +
                emoji + blank + emoji + emoji + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + emoji + emoji + emoji + emoji;
    }

    public String H()
    {
        return  emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + emoji + emoji + emoji + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji;
    }
    public String I()
    {
        return  emoji + emoji + emoji + emoji + emoji + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                emoji + emoji + emoji + emoji + emoji;
    }

    public String J()
    {
        return  emoji + emoji + emoji + emoji + emoji + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                emoji + blank + emoji + blank + blank + "\n" +
                blank + emoji + emoji;
    }

    public String K()
    {
        return  emoji + blank + blank + emoji + blank + "\n" +
                emoji + blank + emoji + blank + blank + "\n" +
                emoji + emoji + blank + blank + blank + "\n" +
                emoji + emoji + blank + blank + blank + "\n" +
                emoji + blank + emoji + blank + blank + "\n" +
                emoji + blank + blank + emoji + blank + "\n" +
                emoji + blank + blank + blank + emoji;
    }

    public String L()
    {
        return  emoji + blank + blank + "\n" +
                emoji + blank + blank + "\n" +
                emoji + blank + blank + "\n" +
                emoji + blank + blank + "\n" +
                emoji + blank + blank + "\n" +
                emoji + blank + blank + "\n" +
                emoji + emoji + emoji;
    }

    public String M()
    {
        return  emoji + blank + blank + blank + emoji + "\n" +
                emoji + emoji + blank + emoji + emoji + "\n" +
                emoji + emoji + emoji + emoji + emoji + "\n" +
                emoji + blank + emoji + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji;
    }

    public String N()
    {
        return  emoji + blank + blank + blank + emoji + "\n" +
                emoji + emoji + blank + blank + emoji + "\n" +
                emoji + emoji + emoji + blank + emoji + "\n" +
                emoji + blank + emoji + emoji + emoji + "\n" +
                emoji + blank + blank + emoji + emoji + "\n" +
                emoji + blank + blank + blank + emoji;
    }

    public String O()
    {
        return  blank + emoji + emoji + emoji + blank + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                blank + emoji + emoji + emoji;
    }

    public String P()
    {
        return  emoji + emoji + emoji + blank + "\n" +
                emoji + blank + blank + emoji + "\n" +
                emoji + blank + blank + emoji + "\n" +
                emoji + emoji + emoji + blank + "\n" +
                emoji + blank + blank + blank + "\n" +
                emoji + blank + blank + blank + "\n" +
                emoji;
    }

    public String Q()
    {
        return  blank + emoji + emoji + emoji + blank + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + emoji + blank + emoji + "\n" +
                emoji + blank + blank + emoji + emoji + "\n" +
                blank + emoji + emoji + emoji + blank + "\n" +
                blank + blank + blank + blank + emoji;
    }

    public String R()
    {
        return  emoji + emoji + emoji + blank + "\n" +
                emoji + blank + blank + emoji + "\n" +
                emoji + blank + blank + emoji + "\n" +
                emoji + emoji + emoji + blank + "\n" +
                emoji + blank + blank + emoji + "\n" +
                emoji + blank + blank + emoji + "\n" +
                emoji + blank + blank + emoji;
    }

    public String S()
    {
        return  blank + emoji + emoji + emoji + blank + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + blank + "\n" +
                blank + emoji + emoji + blank + blank + "\n" +
                blank + blank + blank + emoji + blank + "\n" +
                blank + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                blank + emoji + emoji + emoji;
    }

    public String T()
    {
        return  emoji + emoji + emoji + emoji + emoji + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + blank + emoji;
    }

    public String U()
    {
        return  emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                blank + emoji + emoji + emoji;
    }
    public String V()
    {
        return
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                blank + emoji + blank + emoji + blank + "\n" +
                blank + blank + emoji;
    }

    public String W()
    {
        return
            emoji + blank + blank + blank + blank + blank + blank + blank + emoji + "\n" +
            emoji + blank + blank + blank + emoji + blank + blank + blank + emoji + "\n" +
            emoji + blank + blank + blank + emoji + blank + blank + blank + emoji + "\n" +
            blank + emoji + blank + emoji + blank + emoji + blank + emoji + blank + "\n" +
            blank + blank + emoji + blank + blank + blank + emoji;
    }

    public String X()
    {
        return  emoji + blank + blank + blank + emoji + "\n" +
                emoji + emoji + blank + emoji + emoji + "\n" +
                blank + emoji + emoji + emoji + blank + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + emoji + emoji + emoji + blank + "\n" +
                emoji + blank + blank + blank + emoji + "\n" +
                emoji + blank + blank + blank + emoji;
    }

    public String Y()
    {
        return  emoji + blank + blank + blank + emoji + "\n" +
                emoji + emoji + blank + emoji + emoji + "\n" +
                blank + emoji + emoji + emoji + blank + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + blank + emoji;
    }

    public String Z()
    {
        return  emoji + emoji + emoji + emoji + emoji + "\n" +
                blank + blank + blank + blank + emoji + "\n" +
                blank + blank + blank + emoji + blank + "\n" +
                blank + blank + emoji + blank + blank + "\n" +
                blank + emoji + blank + blank + blank + "\n" +
                emoji + blank + blank + blank + blank + "\n" +
                emoji + emoji + emoji + emoji + emoji;
    }
}
