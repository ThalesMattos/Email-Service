# Email Service
Esta é uma aplicação back-end que tem como objetivo envio de emails simples.

# Tecnologias
As tecnologias utilizadas foram: 
- **AWS SES** (Simple email service)
- **AWS IAM** (Identity and Access Management)
- **Java Spring**

# Instruções de utilização
Após rodar a aplicação com exito, siga o passo a passo abaixo.
1. Para enviar um email, devemos abrir um **cliente https** (como o **Insomnia**, utilizado no exemplo abaixo) e clicar na opção **POST**:
![image](https://github.com/ThalesMattos/Email-service/assets/103903195/ab12abcd-8c9d-4980-9247-656b513a4483)
2. Insita a url **localhost:8080/api/email**:

![image](https://github.com/ThalesMattos/Email-service/assets/103903195/63cfdc9d-1608-4aaa-80fa-5fef49056563)

3. Selecione a linguagem JSON e cole o seguinte trecho de código, apenas alterando o que está entre as aspas duplas:

{
	"to": "Destinatário",
	"subject": "Assunto",
	"body": "Corpo do email"
}

![image](https://github.com/ThalesMattos/Email-service/assets/103903195/04b5a44b-8590-44b6-9d87-8830f4637627)

4. Clique em **Send**:

![image](https://github.com/ThalesMattos/Email-service/assets/103903195/3a9fc151-eec0-425f-8661-ade4271c33cc)

5. Pronto! O email será enviado para o email cadastrado no AWS SES:

![image](https://github.com/ThalesMattos/Email-service/assets/103903195/37e4e5dc-76ff-435e-9020-02836f7e2490)


# Aplicação em funcionamento
