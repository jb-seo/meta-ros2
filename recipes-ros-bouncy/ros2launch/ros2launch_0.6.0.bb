# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The launch command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "launch launch-ros ros2cli ros2pkg"
SRC_URI = "https://github.com/ros2-gbp/launch-release/archive/release/bouncy/${PN}/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5d330f978273a3a38e811cec36ac11a7"
SRC_URI[sha256sum] = "7aad303b42a0d5c2208743193e80f1500bddc5e79eaaf7e18c0063a030c0d90b"
S = "${WORKDIR}/launch-release-release-bouncy-${PN}-0.6.0-0"


inherit ros
inherit setuptools3

