# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implementation of RTPS standard."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "fastcdr asio cmake openssl libtinyxml2"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/1.6.0-5.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7e12300a73ada5e04e81ed1489e9a8df"
SRC_URI[sha256sum] = "17ad3833c0e8405c3f991e1f2b4fa4fab42b0919f481a34dab7c46b61aa365d6"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-1.6.0-5"

inherit ros
inherit cmake


