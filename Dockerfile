version "3"
FROM python3.6:alpine
WORKDIR user/src/app
COPY . .
ENTRYPOINT [ "python3" ]
CMD [ "app.py" ]