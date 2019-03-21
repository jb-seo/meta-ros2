# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package a newer version of uncrustify (0.61+, b6593c1, April 14th 2015)."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=78ab71f8bc669914d3a3405fa3ef1c9c"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/uncrustify-release/archive/release/bouncy/uncrustify_vendor/0.66.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "440627c3799340954fde6f127171ffed"
SRC_URI[sha256sum] = "fb31e852e9392b4cc67543731dd764d9be33a4edf3722a3aa06957056fd99fff"
S = "${WORKDIR}/uncrustify-release-release-bouncy-uncrustify_vendor-0.66.1-1"

inherit ros
inherit ament


