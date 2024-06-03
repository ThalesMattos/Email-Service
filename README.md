# Email Service
Esta é uma aplicação back-end que tem como objetivo envio de emails simples.

# Tecnologias
As tecnologias utilizadas foram: 
- **AWS SES** (Simple email service)
- **AWS IAM** (Identity and Access Management)
- **Java Spring**

# Instruções de utilização

Siga o passo abaixo para rodar a aplicação:

1. Crie ou logue em uma conta na AWS https://aws.amazon.com/.

2. Vamos criar uma identidade no **Amazon Simple Email Service**.
     ![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/fbccfae7-5462-467c-b7fe-21506dce6907)
   
     - Acesse a parte de `Configurações > Identidades`:
   
     ![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/49204261-f8f3-4f6c-b5c2-afe0b080c893)
   
     - Va em criar identidade, selecione a opção endereço de email, insira o email que deseja usar para testar a aplicação e clique em criar identidade:
       
     ![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/73291847-c31d-4c11-8bff-a2e83d63fabe)
     ![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/a89ae313-36b8-4bec-87e5-9cfa843d0f26)

     - Veja qual região está escrita na **Região**:
     ![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/3de03af1-cd2b-4f28-a59a-a634b4475cbf)

     - Clique na opção do canto superior direito que informa a mesma região do passo anterior e copie em um bloco de notas o texto ao lado:
       
     ![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/83db52ad-10cf-40e9-baa0-5a203097d6d0)

3. Após criar uma identidade no **Amazon Simple Email Service**, acesse o **IAM** ou **Identity and Access Management**:
	![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/c4585761-9027-41b6-be7b-af2f1bd58d39)
	- Clique na opção `Gerenciamento de acesso > Usuários` e depois em **criar usuário**:

	![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/4b5171a5-457d-4688-907b-f29dc36db21b)

	![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/90c210a3-4454-4778-8358-4b1c0c203426)

	- Preencha o campo **nome** com o que deseja:
	![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/d7e8a839-9c70-4899-b700-a4ca2ff8a14d)
 
	- Selecione a opção **Anexar políticas diretamente**:
	![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/675991d5-0faa-441e-a8cc-6d151b2408a9)

	- Selecione a opção **AmazonSESFullAccess** e crie o usuário:

	![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/2cf4ec71-225f-4d30-9197-fda72502a6f5)

	![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/261b3b6c-7736-4731-9912-809ffde988d3)

	- Após criar o usuário, clique nele e depois clique na opção **create access key**:
	![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/92cc74ce-8558-4fe5-895b-f2b95862a227)
	![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/370b4972-42f2-450e-8b4d-a91cc71f0a34)

	- Selecione a opção **Aplicação em execução em um serviço computacional da AWS**, marque a **check box** e clique em próximo:
	![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/25a4491a-2c41-4109-b316-ca68f35f7f48)
	![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/ac9e6461-94dc-47f8-83f0-f167c79fc717)

 	- Insira a descrição que desejar e crie a chave de acesso:
	![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/2e7d8461-ac88-483f-8ac0-0f9e6dd0edeb)

 	- Após cria-la, copie a **chave de acesso** e a **chave de acesso secreta** e as anote em um bloco de notas:
	![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/541a9bb8-286b-40c7-8b66-5527c29dcfca)

 	- Pronto, ja pode seguir para o próximo passo!

Clone o repositório:
- Abra um terminal e execute o seguinte comando para clonar o repositório:
	```bash
	git clone https://github.com/ThalesMattos/Email-service.git
	```
- Alternativamente, você pode fazer download do projeto na página deste repositório no GitHub. Para isso, clique em `Code > Download ZIP`
- Substitua os seguintes campos no `application.yml`, dentro da pasta `Email-Service > src> main > resources`, pelos criados no **IAM** e **Amazon SES** :

  ![image](https://github.com/ThalesMattos/Email-Service/assets/103903195/b279be93-40ea-4c77-b286-772a31722f1e)

Após rodar a aplicação com exito, siga o passo a passo abaixo.
1. Para enviar um email, devemos abrir um **cliente https** (como o **Insomnia**, utilizado no exemplo abaixo) e clicar na opção **POST**:

![image](https://github.com/ThalesMattos/Email-service/assets/103903195/ab12abcd-8c9d-4980-9247-656b513a4483)

2. Insita a url **localhost:8080/api/email**:

	![image](https://github.com/ThalesMattos/Email-service/assets/103903195/63cfdc9d-1608-4aaa-80fa-5fef49056563)

3. Selecione a linguagem JSON e cole o seguinte trecho de código, apenas alterando o que está entre as aspas duplas:
```bash
{
	"to": "Destinatário",
	"subject": "Assunto",
	"body": "Corpo do email"
}
```
![image](https://github.com/ThalesMattos/Email-service/assets/103903195/04b5a44b-8590-44b6-9d87-8830f4637627)

4. Clique em **Send**:

![image](https://github.com/ThalesMattos/Email-service/assets/103903195/3a9fc151-eec0-425f-8661-ade4271c33cc)

5. Pronto! O email será enviado para o email cadastrado no AWS SES:

![image](https://github.com/ThalesMattos/Email-service/assets/103903195/37e4e5dc-76ff-435e-9020-02836f7e2490)
