import type { Metadata } from "next";
import { Inter } from "next/font/google";
import SideArea from "./components/SideArea";

import { Toaster } from "@/components/ui/toaster"

const inter = Inter({ subsets: ["latin"] });

export const metadata: Metadata = {
  title: "Create Next App",
  description: "Generated by create next app",
};

export default function RootLayout({
    children, }: Readonly<{
        children: React.ReactNode;
    }>) {

    return (
        <div lang="en" className="flex w-full">
            <aside>
                <SideArea />
            </aside>
            <div className="pt-[20px] w-full">
                {children}
            </div>
            <Toaster />
        </div>
    );
}
