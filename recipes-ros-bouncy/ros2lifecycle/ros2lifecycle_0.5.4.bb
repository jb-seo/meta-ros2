# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The lifecycle command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "lifecycle-msgs rclpy ros2cli ros2node ros2service"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/bouncy/${PN}/0.5.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "76291afcd0c75cd219e91eb4cec3a3fb"
SRC_URI[sha256sum] = "66ce7bfb7c69dc59180b4240349efe9b9be5044b49cb755b7ef84855b12c67d2"
S = "${WORKDIR}/ros2cli-release-release-bouncy-${PN}-0.5.4-0"


inherit ros
inherit setuptools3

