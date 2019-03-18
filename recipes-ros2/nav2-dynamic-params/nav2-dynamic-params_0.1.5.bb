# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a validation class for ROS2 parameters with validation based on parameter     type and defined bounds. Support for custom validation callbacks is also provided. Some useful     convenience functions for event callbacks are also provided"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " rclcpp"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_dynamic_params/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1523ea7499c54bc7c2f215db4a44d615"
SRC_URI[sha256sum] = "98ec544a77a1ad4ca60a8d9c6a2dcb296ac75a89fe61dd2de39c10d2c065f851"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_dynamic_params-0.1.5-0"

inherit ament
