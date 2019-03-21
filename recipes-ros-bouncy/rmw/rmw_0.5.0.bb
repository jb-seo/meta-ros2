# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains the ROS middleware API."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rcutils rosidl-generator-c"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5b8ea7a5f3393617671a4cff9f7c084b"
SRC_URI[sha256sum] = "965cfbf68435c46208554d36499ade0280665b4edc3b446a323b2515a01ffbc3"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-0.5.0-0"

inherit ros
inherit ament


