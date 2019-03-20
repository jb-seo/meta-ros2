# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The service command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rclpy ros2cli ros2srv ros2topic python3-yaml"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/bouncy/${PN}/0.5.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2f1af1869ac89c8a8276de8db0ad0538"
SRC_URI[sha256sum] = "d7a9bf67cd56d205b572912db9c8d003b688a60369f2d69e914e493661496b96"
S = "${WORKDIR}/ros2cli-release-release-bouncy-${PN}-0.5.4-0"


inherit ros
inherit setuptools3

