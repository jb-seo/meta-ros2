# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages and service files for the navigation2 stack"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake builtin-interfaces geometry-msgs rclcpp rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_msgs/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "20321f118d9aab3faa541589d706e003"
SRC_URI[sha256sum] = "b2deb2e6d24297892fb9f8547620396169c2c5bb41d3220ef191d6908e6d57f4"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_msgs-0.1.5-0"

inherit catkin
