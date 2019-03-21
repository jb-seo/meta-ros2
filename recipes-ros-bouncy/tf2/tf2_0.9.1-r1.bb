# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2 is the second generation of the transform library, which lets     the user keep track of multiple coordinate frames over time. tf2     maintains the relationship between coordinate frames in a tree     structure buffered in time, and lets the user transform points,     vectors, etc between any two coordinate frames at any desired     point in time."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "console-bridge geometry-msgs"
SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/bouncy/${PN}/0.9.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de4512e1ebef6bb0086e78e521246158"
SRC_URI[sha256sum] = "ab9e1d651e8a3c205b21faae345f679a4fd90ac9690f33f1500320dd38347965"
S = "${WORKDIR}/geometry2-release-release-bouncy-${PN}-0.9.1-1"

inherit ros
inherit ament


