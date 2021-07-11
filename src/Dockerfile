version "3"
FROM python3.5:alpine
COPY . /src/
RUN make /src
CMD ["python3", "/src/app.py"]