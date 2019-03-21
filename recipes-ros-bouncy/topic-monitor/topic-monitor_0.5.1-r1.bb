# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing tools for monitoring ROS 2 topics."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "launch launch-ros rclpy std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/topic_monitor/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9b68a56c23b5cc9d545e900b5c6b4aa6"
SRC_URI[sha256sum] = "fae680e5ff1fa56d53e7590a62d147c019dbada612f0c819a5f6e95b5383cffc"
S = "${WORKDIR}/demos-release-release-bouncy-topic_monitor-0.5.1-1"

inherit ros
inherit setuptools3


