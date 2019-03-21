# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The run command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ros2cli ros2pkg"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/bouncy/${PN}/0.5.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "09aa33b836dd427cca065f286f5512d0"
SRC_URI[sha256sum] = "75db756c2b7b0b1c5afcd4b82d09f41e04c8317ec2d5edc986d00a1f27e8cebd"
S = "${WORKDIR}/ros2cli-release-release-bouncy-${PN}-0.5.4-0"

inherit ros
inherit setuptools3


