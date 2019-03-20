# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Framework for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rclpy python3-pkg-resources"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/0.5.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6ec27b17b1e5c33f5da30b35d10479e4"
SRC_URI[sha256sum] = "3f4601d28696c988af575f471e11836ecc216a6f461e584d11517ec47934e44e"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-0.5.4-0"


inherit ros
inherit setuptools3

