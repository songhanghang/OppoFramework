package com.android.org.conscrypt.ct;

import com.android.org.conscrypt.OpenSSLX509Certificate;
import com.android.org.conscrypt.ct.SignedCertificateTimestamp.Origin;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.ct.SignedCertificateTimestamp;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.isAllBlocksEmpty(BlockUtils.java:546)
    	at jadx.core.dex.visitors.ExtractFieldInit.getConstructorsList(ExtractFieldInit.java:221)
    	at jadx.core.dex.visitors.ExtractFieldInit.moveCommonFieldsInit(ExtractFieldInit.java:121)
    	at jadx.core.dex.visitors.ExtractFieldInit.visit(ExtractFieldInit.java:46)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:12)
    	at jadx.core.ProcessClass.process(ProcessClass.java:32)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
    	at java.lang.Iterable.forEach(Iterable.java:75)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
    	at jadx.core.ProcessClass.process(ProcessClass.java:37)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
    */
public class CTVerifier {
    private final CTLogStore store;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: bogus opcode: 00e8 in method: com.android.org.conscrypt.ct.CTVerifier.<init>(com.android.org.conscrypt.ct.CTLogStore):void, dex: 
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:118)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:248)
        	at jadx.core.ProcessClass.process(ProcessClass.java:29)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        Caused by: java.lang.IllegalArgumentException: bogus opcode: 00e8
        	at com.android.dx.io.OpcodeInfo.get(OpcodeInfo.java:1227)
        	at com.android.dx.io.OpcodeInfo.getName(OpcodeInfo.java:1234)
        	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:581)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:74)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:104)
        	... 9 more
        */
    public CTVerifier(com.android.org.conscrypt.ct.CTLogStore r1) {
        /*
        // Can't load method instructions: Load method exception: bogus opcode: 00e8 in method: com.android.org.conscrypt.ct.CTVerifier.<init>(com.android.org.conscrypt.ct.CTLogStore):void, dex: 
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.org.conscrypt.ct.CTVerifier.<init>(com.android.org.conscrypt.ct.CTLogStore):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: bogus opcode: 00e9 in method: com.android.org.conscrypt.ct.CTVerifier.getSCTsFromOCSPResponse(byte[], com.android.org.conscrypt.OpenSSLX509Certificate[]):java.util.List<com.android.org.conscrypt.ct.SignedCertificateTimestamp>, dex: 
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:118)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:248)
        	at jadx.core.ProcessClass.process(ProcessClass.java:29)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        Caused by: java.lang.IllegalArgumentException: bogus opcode: 00e9
        	at com.android.dx.io.OpcodeInfo.get(OpcodeInfo.java:1227)
        	at com.android.dx.io.OpcodeInfo.getName(OpcodeInfo.java:1234)
        	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:581)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:74)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:104)
        	... 9 more
        */
    private java.util.List<com.android.org.conscrypt.ct.SignedCertificateTimestamp> getSCTsFromOCSPResponse(byte[] r1, com.android.org.conscrypt.OpenSSLX509Certificate[] r2) {
        /*
        // Can't load method instructions: Load method exception: bogus opcode: 00e9 in method: com.android.org.conscrypt.ct.CTVerifier.getSCTsFromOCSPResponse(byte[], com.android.org.conscrypt.OpenSSLX509Certificate[]):java.util.List<com.android.org.conscrypt.ct.SignedCertificateTimestamp>, dex: 
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.org.conscrypt.ct.CTVerifier.getSCTsFromOCSPResponse(byte[], com.android.org.conscrypt.OpenSSLX509Certificate[]):java.util.List<com.android.org.conscrypt.ct.SignedCertificateTimestamp>");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: bogus opcode: 00e9 in method: com.android.org.conscrypt.ct.CTVerifier.getSCTsFromX509Extension(com.android.org.conscrypt.OpenSSLX509Certificate):java.util.List<com.android.org.conscrypt.ct.SignedCertificateTimestamp>, dex: 
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:118)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:248)
        	at jadx.core.ProcessClass.process(ProcessClass.java:29)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        Caused by: java.lang.IllegalArgumentException: bogus opcode: 00e9
        	at com.android.dx.io.OpcodeInfo.get(OpcodeInfo.java:1227)
        	at com.android.dx.io.OpcodeInfo.getName(OpcodeInfo.java:1234)
        	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:581)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:74)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:104)
        	... 9 more
        */
    private java.util.List<com.android.org.conscrypt.ct.SignedCertificateTimestamp> getSCTsFromX509Extension(com.android.org.conscrypt.OpenSSLX509Certificate r1) {
        /*
        // Can't load method instructions: Load method exception: bogus opcode: 00e9 in method: com.android.org.conscrypt.ct.CTVerifier.getSCTsFromX509Extension(com.android.org.conscrypt.OpenSSLX509Certificate):java.util.List<com.android.org.conscrypt.ct.SignedCertificateTimestamp>, dex: 
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.org.conscrypt.ct.CTVerifier.getSCTsFromX509Extension(com.android.org.conscrypt.OpenSSLX509Certificate):java.util.List<com.android.org.conscrypt.ct.SignedCertificateTimestamp>");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: bogus opcode: 00e9 in method: com.android.org.conscrypt.ct.CTVerifier.markSCTsAsInvalid(java.util.List, com.android.org.conscrypt.ct.CTVerificationResult):void, dex: 
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:118)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:248)
        	at jadx.core.ProcessClass.process(ProcessClass.java:29)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        Caused by: java.lang.IllegalArgumentException: bogus opcode: 00e9
        	at com.android.dx.io.OpcodeInfo.get(OpcodeInfo.java:1227)
        	at com.android.dx.io.OpcodeInfo.getName(OpcodeInfo.java:1234)
        	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:581)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:74)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:104)
        	... 9 more
        */
    private void markSCTsAsInvalid(java.util.List<com.android.org.conscrypt.ct.SignedCertificateTimestamp> r1, com.android.org.conscrypt.ct.CTVerificationResult r2) {
        /*
        // Can't load method instructions: Load method exception: bogus opcode: 00e9 in method: com.android.org.conscrypt.ct.CTVerifier.markSCTsAsInvalid(java.util.List, com.android.org.conscrypt.ct.CTVerificationResult):void, dex: 
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.org.conscrypt.ct.CTVerifier.markSCTsAsInvalid(java.util.List, com.android.org.conscrypt.ct.CTVerificationResult):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: bogus opcode: 0073 in method: com.android.org.conscrypt.ct.CTVerifier.verifyEmbeddedSCTs(java.util.List, com.android.org.conscrypt.OpenSSLX509Certificate[], com.android.org.conscrypt.ct.CTVerificationResult):void, dex: 
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:118)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:248)
        	at jadx.core.ProcessClass.process(ProcessClass.java:29)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        Caused by: java.lang.IllegalArgumentException: bogus opcode: 0073
        	at com.android.dx.io.OpcodeInfo.get(OpcodeInfo.java:1227)
        	at com.android.dx.io.OpcodeInfo.getName(OpcodeInfo.java:1234)
        	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:581)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:74)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:104)
        	... 9 more
        */
    private void verifyEmbeddedSCTs(java.util.List<com.android.org.conscrypt.ct.SignedCertificateTimestamp> r1, com.android.org.conscrypt.OpenSSLX509Certificate[] r2, com.android.org.conscrypt.ct.CTVerificationResult r3) {
        /*
        // Can't load method instructions: Load method exception: bogus opcode: 0073 in method: com.android.org.conscrypt.ct.CTVerifier.verifyEmbeddedSCTs(java.util.List, com.android.org.conscrypt.OpenSSLX509Certificate[], com.android.org.conscrypt.ct.CTVerificationResult):void, dex: 
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.org.conscrypt.ct.CTVerifier.verifyEmbeddedSCTs(java.util.List, com.android.org.conscrypt.OpenSSLX509Certificate[], com.android.org.conscrypt.ct.CTVerificationResult):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: bogus opcode: 0073 in method: com.android.org.conscrypt.ct.CTVerifier.verifyExternalSCTs(java.util.List, com.android.org.conscrypt.OpenSSLX509Certificate, com.android.org.conscrypt.ct.CTVerificationResult):void, dex: 
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:118)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:248)
        	at jadx.core.ProcessClass.process(ProcessClass.java:29)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        Caused by: java.lang.IllegalArgumentException: bogus opcode: 0073
        	at com.android.dx.io.OpcodeInfo.get(OpcodeInfo.java:1227)
        	at com.android.dx.io.OpcodeInfo.getName(OpcodeInfo.java:1234)
        	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:581)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:74)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:104)
        	... 9 more
        */
    private void verifyExternalSCTs(java.util.List<com.android.org.conscrypt.ct.SignedCertificateTimestamp> r1, com.android.org.conscrypt.OpenSSLX509Certificate r2, com.android.org.conscrypt.ct.CTVerificationResult r3) {
        /*
        // Can't load method instructions: Load method exception: bogus opcode: 0073 in method: com.android.org.conscrypt.ct.CTVerifier.verifyExternalSCTs(java.util.List, com.android.org.conscrypt.OpenSSLX509Certificate, com.android.org.conscrypt.ct.CTVerificationResult):void, dex: 
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.org.conscrypt.ct.CTVerifier.verifyExternalSCTs(java.util.List, com.android.org.conscrypt.OpenSSLX509Certificate, com.android.org.conscrypt.ct.CTVerificationResult):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: bogus opcode: 00e5 in method: com.android.org.conscrypt.ct.CTVerifier.verifySingleSCT(com.android.org.conscrypt.ct.SignedCertificateTimestamp, com.android.org.conscrypt.ct.CertificateEntry):com.android.org.conscrypt.ct.VerifiedSCT$Status, dex: 
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:118)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:248)
        	at jadx.core.ProcessClass.process(ProcessClass.java:29)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        Caused by: java.lang.IllegalArgumentException: bogus opcode: 00e5
        	at com.android.dx.io.OpcodeInfo.get(OpcodeInfo.java:1227)
        	at com.android.dx.io.OpcodeInfo.getName(OpcodeInfo.java:1234)
        	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:581)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:74)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:104)
        	... 9 more
        */
    private com.android.org.conscrypt.ct.VerifiedSCT.Status verifySingleSCT(com.android.org.conscrypt.ct.SignedCertificateTimestamp r1, com.android.org.conscrypt.ct.CertificateEntry r2) {
        /*
        // Can't load method instructions: Load method exception: bogus opcode: 00e5 in method: com.android.org.conscrypt.ct.CTVerifier.verifySingleSCT(com.android.org.conscrypt.ct.SignedCertificateTimestamp, com.android.org.conscrypt.ct.CertificateEntry):com.android.org.conscrypt.ct.VerifiedSCT$Status, dex: 
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.org.conscrypt.ct.CTVerifier.verifySingleSCT(com.android.org.conscrypt.ct.SignedCertificateTimestamp, com.android.org.conscrypt.ct.CertificateEntry):com.android.org.conscrypt.ct.VerifiedSCT$Status");
    }

    public CTVerificationResult verifySignedCertificateTimestamps(OpenSSLX509Certificate[] chain, byte[] tlsData, byte[] ocspData) throws CertificateEncodingException {
        if (chain.length == 0) {
            throw new IllegalArgumentException("Chain of certificates mustn't be empty.");
        }
        OpenSSLX509Certificate leaf = chain[0];
        CTVerificationResult result = new CTVerificationResult();
        verifyExternalSCTs(getSCTsFromTLSExtension(tlsData), leaf, result);
        verifyExternalSCTs(getSCTsFromOCSPResponse(ocspData, chain), leaf, result);
        verifyEmbeddedSCTs(getSCTsFromX509Extension(chain[0]), chain, result);
        return result;
    }

    private List<SignedCertificateTimestamp> getSCTsFromSCTList(byte[] data, Origin origin) {
        if (data == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            byte[][] sctList = Serialization.readList(data, 2, 2);
            List<SignedCertificateTimestamp> scts = new ArrayList();
            for (byte[] encodedSCT : sctList) {
                try {
                    scts.add(SignedCertificateTimestamp.decode(encodedSCT, origin));
                } catch (SerializationException e) {
                }
            }
            return scts;
        } catch (SerializationException e2) {
            return Collections.EMPTY_LIST;
        }
    }

    private List<SignedCertificateTimestamp> getSCTsFromTLSExtension(byte[] data) {
        return getSCTsFromSCTList(data, Origin.TLS_EXTENSION);
    }
}
