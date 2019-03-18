# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TODO"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " behaviortree-cpp builtin-interfaces geometry-msgs nav2-msgs rclcpp rosidl-default-generators rosidl-default-runtime std-msgs tf2 tf2-geometry-msgs"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_tasks/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d80f1520f08f59a99cc1b2922da496c1"
SRC_URI[sha256sum] = "883fffb5d6c4c2636e46de8ffda18e083a9085f3caf4e460dc2a9f5eab3a3a03"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_tasks-0.1.5-0"

inherit ament
