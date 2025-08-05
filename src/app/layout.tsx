import type { Metadata } from "next";
import { JetBrains_Mono, Roboto } from "next/font/google";
import "./globals.css";

const jetbrainsMono = JetBrains_Mono({
  variable: "--font-jetbrain-mono",
  subsets: ["latin"]
})

const roboto = Roboto({
  variable: "--font-roboto",
  subsets: ["latin"]
})

export const metadata: Metadata = {
  title: "Sefault",
  description: "Because Segfault.com was too expensive",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en">
      <body
        className={`${roboto.variable} ${jetbrainsMono.variable} antialiased`}
      >
        {children}
      </body>
    </html>
  );
}
