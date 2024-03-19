import Profile from "@/public/icons/profile.jpg"
import { TutorInfo } from "@/lib/types"

import { Button } from "@/components/ui/button"

import {
    Card,
    CardContent,
    CardDescription,
    CardFooter,
    CardHeader,
    CardTitle,
  } from "@/components/ui/card"

import ProfileForm from "./Form"

import ImageForm from "./ImageForm"

export default async function Page() {

    const tutorInfo: TutorInfo = {
        firstName: "John",
        lastName: "Doe",
        email: "john.doe@gmail.com",
        image: Profile,
        bio: "Hi, I am Joe Doe. I am a tutor at XYZ. I have been teaching for 5 years. I have a degree in Computer Science. I am passionate about teaching and helping students. I am available for tutoring on weekdays and weekends. I am also available for online tutoring. I am looking forward to helping you.",
        tags: ["Computer Science", "Math", "Physics", "Chemistry", "Biology"]
    }


    return(
        <div className="flex items-center justify-center w-full flex-col p-5 min-h-[calc(100vh-60px)]">
            <Card className="shadow-xl min-w-[300px] w-[75%]"> 
                <CardHeader className="text-center">
                    <CardTitle>Profile</CardTitle>
                    <CardDescription>
                        Edit your profile here.
                    </CardDescription>
                </CardHeader>
                <div className="flex flex-col sm:flex-col md:flex-row lg:flex-row justify-around">
                    <CardContent className="">
                        <ProfileForm data={tutorInfo!}/>
                    </CardContent>
                    <CardContent>
                        <ImageForm imageData={tutorInfo.image}/>
                    </CardContent>
                </div>
            </Card>
        </div>
    )
}