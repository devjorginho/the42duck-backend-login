# The 42 Duck Backend – Guia de Criação de Usuário

Este guia explica como consumir o backend do projeto **The 42 Duck** para registrar e autenticar usuários.

---

## URL Base do Backend

https://the42duck-backend.up.railway.app


Todas as rotas de autenticação começam a partir dessa URL.

---

## Rotas Disponíveis

### Registro de Usuário

POST /auth/register


### Login de Usuário

POST /auth/login


---

## Formato do JSON para Envio

### Registro

```json
{
  "username": "seu_usuario",
  "email": "seu_email",
  "password": "sua_senha"
}

Login

{
  "username": "seu_usuario",
  "password": "sua_senha"
}

    ⚠️ O campo email só é necessário durante o registro.
