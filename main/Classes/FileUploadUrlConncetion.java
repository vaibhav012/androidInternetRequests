//EXECUTION : new UploadFile().execute(fileUri.getPath());
    /*private class UploadFile extends AsyncTask<String, Integer, String> {
        int serverResponseCode = 0;
        String resultToReturn = "";
        String upLoadServerUri = Config.FILE_UPLOAD_URL;
        HttpURLConnection conn = null;
        DataOutputStream dos = null;
        String lineEnd = "\r\n";
        String twoHyphens = "--";
        String boundary = "*****";
        int bytesRead, bytesAvailable, bufferSize;
        byte[] buffer;
        int maxBufferSize = 1 * 1024 * 1024;
        @Override
        protected void onPreExecute() {
            // setting progress bar to zero
            uploadImageProgress.show();
            uploadImageProgress.setProgress(0);
            super.onPreExecute();
        }

        @Override
        protected void onProgressUpdate(Integer... progress) {
            uploadImageProgress.setProgress(progress[0]);
            Log.e("TAG: imageOrder", progress[0]+"");
        }


        @Override
        protected String doInBackground(String... params) {
            try {
                String fileName = params[0];
                String fileExtn = fileName.substring(fileName.lastIndexOf(".") + 1);
                Log.d("TAG: imageorder-> ", fileName);
                File sourceFile = new File(params[0]);
                FileInputStream fileInputStream = new FileInputStream(sourceFile);
                URL url = new URL(upLoadServerUri);
                conn = (HttpURLConnection) url.openConnection(); // Open a HTTP  connection to  the URL
                conn.setDoInput(true); // Allow Inputs
                conn.setDoOutput(true); // Allow Outputs
                conn.setUseCaches(false); // Don't use a Cached Copy
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Connection", "Keep-Alive");
                conn.setRequestProperty("ENCTYPE", "multipart/form-data");
                conn.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
                conn.setRequestProperty("uploaded_file", fileName);
                dos = new DataOutputStream(conn.getOutputStream());
                Log.d("TAG: imageorder-> ", "in doIn Background()");

                dos.writeBytes(twoHyphens + boundary + lineEnd);
                dos.writeBytes("Content-Disposition: form-data; name=\"uploaded_file\";filename=\""+ tempOId+"."+fileExtn + "\"" + lineEnd);
                dos.writeBytes(lineEnd);

                while ((bytesAvailable = fileInputStream.available()) > 0)
                {
                    bufferSize = Math.min(bytesAvailable, maxBufferSize);
                    byte[] buffer = new byte[bufferSize];
                    bytesRead = fileInputStream.read(buffer, 0, bufferSize);
                    dos.write(buffer, 0, bytesRead);
                }
                dos.writeBytes(lineEnd);
                dos.writeBytes(twoHyphens + boundary + twoHyphens + lineEnd);

                Log.d("TAG: imageorder-> ", "after Write Bytes");

                // Responses from the server (code and message)
                serverResponseCode = conn.getResponseCode();
                String serverResponseMessage = conn.getResponseMessage();

                Log.i("imageorder", "HTTP Response is : " + serverResponseMessage + ": " + serverResponseCode);
                if(serverResponseCode == 200){
                    //resultToReturn = serverResponseMessage;
                    BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    resultToReturn = br.readLine();
                }

                //close the streams //
                fileInputStream.close();
                dos.flush();
                dos.close();

            } catch (MalformedURLException ex) {
                ex.printStackTrace();
                resultToReturn = "MalformedURLException";
                Log.e("imageorder", "error: " + ex.getMessage(), ex);
            } catch (Exception e) {
                e.printStackTrace();
                resultToReturn = "Exception : " + e.toString();
            }
            return resultToReturn;
        }

        @Override
        protected void onPostExecute(String result) {
            Log.e("imageorder", "Response from server: " + result);
            uploadImageProgress.hide();
            if(result.substring(0, 8).equals("Uploaded"))
                showAlert(result, 1);
            else
                showAlert(result, 0);
            super.onPostExecute(result);
        }

    }*/
