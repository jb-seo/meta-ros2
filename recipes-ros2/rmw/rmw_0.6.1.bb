# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains the ROS middleware API."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " rcutils rosidl-generator-c"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/crystal/${PN}/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3b77e51a796500d8daaf6c22e641d673"
SRC_URI[sha256sum] = "84db3e5964876c57a44fdd440da1df948bc548516baafee870546d851822990b"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-0.6.1-0"

inherit ament
