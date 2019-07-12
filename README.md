# CampaignMVP

A native Android application designed to list a current list of campaigns gathered from a network. 
Campaigns can be of two types: a generic banner with campaign info, and a "Hot Deal" containing a title and expiration date for its campaign.
Banners and Hot Deals are listed in tandem, i.e a banner follows a hot deal. This is combined with an endless-scroll feature utilizing a 
recyclerView.

## Motivation
This application is a entry to Android architecture, coding syntax with Kotlin/Java (Kotlin is preferred) 
and how to incorporate various libraries such as Retrofit and Glide into a project.

## Application Demo:
![CampaignMVP Demo](Demos/CampaignApp_demo.gif)

## Tech/Framework 
This project is built using:

Application:
- Retrofit
- Glide
- DataBinding

Testing:
- JUnit
- Mockito
- Espresso

## Structure

### Architecture: 
__Model-View-Presenter (MVP)__

### Networking: 

- Retrofit client:

- Service interface:
