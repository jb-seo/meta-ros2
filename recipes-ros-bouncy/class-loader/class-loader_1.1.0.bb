# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The class_loader package is a ROS-independent package for loading plugins during runtime and the foundation of the higher level ROS &quot;pluginlib&quot; library.     class_loader utilizes the host operating system's runtime loader to open runtime libraries (e.g. .so/.dll files), introspect the library for exported plugin classes, and allows users to instantiate objects of these exported classes without the explicit declaration (i.e. header file) for those classes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "console-bridge poco-vendor poco"
SRC_URI = "https://github.com/ros2-gbp/class_loader-release/archive/release/bouncy/class_loader/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cff2b04ef68a5ab0697b4e686abfb6d9"
SRC_URI[sha256sum] = "89ac89ccd88f25b713c4248b21a4ab6eff42ea75948b337f798e50d0d7c97215"
S = "${WORKDIR}/class_loader-release-release-bouncy-class_loader-1.1.0-0"


inherit ros
inherit ament

