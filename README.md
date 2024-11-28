# AbstractFactory1
```markdown
# Sistema de Aluguel de Meios de Transporte Individuais

## Descrição
Este projeto implementa um sistema para gerenciar o aluguel de meios de transporte individuais, como bicicletas, patinetes, patins e skates, utilizando o padrão de projeto Abstract Factory para criar diferentes meios de transporte, diferenciando-os pelo tipo de propulsão (movido a bateria ou esforço humano).

## Tabela de Conteúdos
- [Instalação](#instalação)
- [Uso](#uso)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Desenvolvimento](#desenvolvimento)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Instalação
1. Clone o repositório:
   ```sh
   git clone https://github.com/usuario/projeto-transporte.git
   ```
2. Navegue até o diretório do projeto:
   ```sh
   cd projeto-transporte/src
   ```
3. Compile os arquivos Java:
   ```sh
   javac com/example/transport/*.java
   ```

## Uso
1. Execute a classe principal:
   ```sh
   java com.example.transport.Main
   ```
2. O sistema exibirá mensagens informando o uso de cada meio de transporte.

## Estrutura do Projeto
```plaintext
src/
└── com.example.transport
    ├── Transport.java (Interface)
    ├── ElectricScooter.java (Classe concreta)
    ├── ElectricBike.java (Classe concreta)
    ├── Bicycle.java (Classe concreta)
    ├── RollerSkates.java (Classe concreta)
    ├── Skateboard.java (Classe concreta)
    ├── TransportFactory.java (Fábrica abstrata)
    ├── ElectricTransportFactory.java (Fábrica concreta)
    ├── HumanPoweredTransportFactory.java (Fábrica concreta)
    └── Main.java (Classe principal)
```

## Desenvolvimento
### Padrão de Projeto: Abstract Factory
O sistema utiliza o padrão Abstract Factory para gerenciar a criação dos objetos de transporte.

### Classes e Interfaces
- **Transport**: Interface que representa um meio de transporte genérico.
- **ElectricScooter, ElectricBike**: Classes concretas para meios de transporte movidos a bateria.
- **Bicycle, RollerSkates, Skateboard**: Classes concretas para meios de transporte movidos pelo esforço humano.
- **TransportFactory**: Fábrica abstrata que declara métodos para criar transportes.
- **ElectricTransportFactory, HumanPoweredTransportFactory**: Fábricas concretas que criam meios de transporte específicos.

## Contribuição
Para contribuir com o projeto, siga estes passos:
1. Faça um fork do repositório.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas alterações (`git commit -m 'Adiciona nova feature'`).
4. Faça o push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Licença
Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
```
