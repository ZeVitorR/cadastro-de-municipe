import java.util.*;

public class index{

    public static void main(String[] args) throws InputMismatchException{
        int cont=0;
        Rg rg1 = new Rg();
        Pessoas p = new Pessoas();
        Contato c = new Contato();
        Cpf cpf = new Cpf();
        Titulo titulo = new Titulo();
        CupomFiscal fiscal = new CupomFiscal();
        Educacao edu = new Educacao();
        Residencia casa = new Residencia();
        Vinculos vinculo = new Vinculos();
        Cadastro u= new Cadastro();
        List<Cadastro> lista = new ArrayList<>();
        try (Scanner anotar = new Scanner(System.in)) {
            
            int f=-2;
            while(f != 0){
                System.out.println("\n\nCadastro de municipe");
                System.out.println("1-Cadastrar");
                System.out.println("2-remover");
                System.out.println("3-ver nomes cadastrados");
                System.out.println("4-ver cadastrados");
                System.out.println("0-sair");
                System.out.print("Sua opcao:");
                f=anotar.nextInt();
                if(f == 1){
                    anotar.nextLine();
                    System.out.println("Cadastro "+lista.size()+"\n");
                    System.out.print("nome completo:");
                    p.setNome(anotar.nextLine(),cont);
                    System.out.print("RG:");
                    rg1.setNumero(anotar.nextLine(),cont);;
                    System.out.print("Orgao Emissor:");
                    rg1.setEmissor(anotar.nextLine(),cont);
                    System.out.print("Uf:");
                    rg1.setUf(anotar.nextLine(),cont);
                    System.out.print("Data de emisso:");    
                    rg1.setDate(anotar.nextLine(),cont);
                    System.out.print("Cpf:");
                    cpf.setNumero(anotar.nextLine(),cont);
                    System.out.print("titulo:");
                    titulo.setNumero(anotar.nextLine(),cont);
                    System.out.print("Secao:");
                    titulo.setSecao(anotar.nextInt(),cont);
                    System.out.print("Zona:");
                    titulo.setSecao(anotar.nextInt(),cont);
                    System.out.print("Sexo (1-masculino, 2-feminino) : ");
                    int i=anotar.nextInt();
                    if( i == 1){
                        p.setSexo("masculino",cont);
                    }else if(i == 2){
                        p.setSexo("feminino",cont);
                    }
                    System.out.print("Estado civil (1-casado, 2-solteiro, 3-separado, 4-concubinato, 5-viuvo, 6-divorciado):");
                    int j=anotar.nextInt();
                    if( j == 1){
                        p.setEstadoCivil("casado",cont);
                    }else if(i == 2){
                        p.setEstadoCivil("solteiro",cont);
                    }else if(i == 3){
                        p.setEstadoCivil("separado",cont);
                    }else if(i == 4){
                        p.setEstadoCivil("concubinato",cont);
                    }else if(i == 5){
                        p.setEstadoCivil("viuvo",cont);
                    }else if(i == 3){
                        p.setEstadoCivil("divorciado",cont);
                    }
                    System.out.print("possui quantos dependes: ");
                    u.setDependente(anotar.nextInt(),cont);
                    anotar.nextLine();
                    System.out.print("data de nascimento:");
                    p.setNascimento(anotar.nextLine(),cont);
                    System.out.print("naturalidade:");
                    p.setNaturalidade(anotar.nextLine(),cont);
                    System.out.print("data de nacionalidade:");
                    p.setNacionalidade(anotar.nextLine(),cont);
                    System.out.print("endereço:");
                    casa.setEndereco(anotar.nextLine(),cont);
                    System.out.print("bairro:");
                    casa.setBairro(anotar.nextLine(),cont);
                    System.out.print("numero:");
                    casa.setNumero(anotar.nextInt(),cont);
                    anotar.nextLine();
                    System.out.print("telefone:");
                    c.setTelefone(anotar.nextLine(),cont);
                    System.out.print("celular:");
                    c.setCelular(anotar.nextLine(),cont);
                    System.out.print("data da chegada:");
                    p.setDataChegada(anotar.nextLine(),cont);
                    System.out.print("cor(1-branco, 2-negro, 3-amarelo , 4-pardo):");
                    int g=anotar.nextInt();
                    if( g == 1){
                        p.setCor("branca",cont);
                    }else if(g == 2){
                        p.setCor("negra",cont);
                    }else if(g == 3){
                        p.setCor("amarela",cont);
                    }else if(g == 4){
                        p.setCor("pardo",cont);
                    }
                    anotar.nextLine();
                    System.out.print("nome do pai:");
                    p.setPai(anotar.nextLine(),cont);
                    System.out.print("nome do mae:");
                    p.setMae(anotar.nextLine(),cont);
                    System.out.print("ocupacao:");
                    p.setOcupacao(anotar.nextLine(),cont);
                    System.out.print("escolariedade:");
                    edu.setEscolariedade(anotar.nextLine(),cont);
                    System.out.print("formacao:");
                    edu.setFormacao(anotar.nextLine(),cont);
                    System.out.print("onde estuda:");
                    edu.setLocal(anotar.nextLine(),cont);
                    System.out.print("pretende voltar a estudar:");
                    edu.setEscolariedade(anotar.nextLine(),cont);
                    System.out.print("estudo pretendido:");
                    edu.setEstudoPretendido(anotar.nextLine(),cont);
                    System.out.print("Portador de nescessidade: (0-nao, 1-fisica, 2-mental,3-auditiva,4-visual");
                    int n = anotar.nextInt();
                    if(n == 0){
                        p.setNescessidade("não",cont);
                    }else if( n == 1){
                        p.setNescessidade("fisica",cont);
                    }else if(n == 2){
                        p.setNescessidade("mental",cont);
                    }else if(n == 3){
                        p.setNescessidade("auditiva",cont);
                    }else if(n == 4){
                        p.setNescessidade("visual",cont);
                    }
                    anotar.nextLine();
                    System.out.print("Solicita cupom fiscal:");
                    fiscal.setResposta(anotar.nextLine(),cont);
                    System.out.print("Clube:");
                    vinculo.setClube(anotar.nextLine(),cont);
                    System.out.print("Associação:");
                    vinculo.setAssociacao(anotar.nextLine(),cont);
                    System.out.print("Sindicato:");
                    vinculo.setSindicato(anotar.nextLine(),cont);
                    System.out.print("Religião:");
                    vinculo.setReligiao(anotar.nextLine(),cont);
                    u.setRgCidadao(rg1);
                    u.setCidadao(p);
                    u.setContatoCidadao(c);
                    u.setCupomCidadao(fiscal);
                    u.setEduCidadao(edu);
                    u.setCpfCidado(cpf);
                    u.setResidenciaCidadao(casa);
                    u.setTituloCidadao(titulo);
                    u.setVinculoCidadao(vinculo);
                    lista.add(cont,u);
                    cont++;
                }else if(f == 2){
                    anotar.nextLine();
                    System.out.println("============================================");
                    System.out.println("remover cadastro");
                    System.out.println("qual o cpf do cadastro a ser removido:");
                    String cpfr = anotar.nextLine();
                    for(int i = 0; i < lista.size(); i++) {
                        if(lista.get(i).getCpfCidado().getNumero(i).equals(cpfr)){
                            lista.remove(i);
                        }                        
                    }
                }else if(f == 3 ){
                    for(int i = 0; i <lista.size(); i++) {
                        System.out.println(lista.get(i).getCidadao().getNome(i));
                    }
                }else if(f == 4){
                    for(int i = 0; i < lista.size(); i++) {
                        lista.get(i).imprimeTudo(i);
                    }
                }
            }       
        }catch(InputMismatchException e){
            System.out.println("Exeção de numero");
        }
    }
}




    
      