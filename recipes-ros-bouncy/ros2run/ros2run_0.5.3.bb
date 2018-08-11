# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The run command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ros2cli ros2pkg"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/bouncy/${PN}/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f8fb1a552421531f6ac8663d4a42c8fc"
SRC_URI[sha256sum] = "680c9c5282ae62332a931565b6c2e74bdaf42bbfd3341f0c1a26d7f289e02af7"
S = "${WORKDIR}/ros2cli-release-release-bouncy-${PN}-0.5.3-0"

inherit catkin
