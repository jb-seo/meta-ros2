# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TODO"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " behaviortree-cpp geometry-msgs nav2-msgs nav2-tasks rclcpp std-msgs"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_mission_executor/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "05d212028371de569f044c46916ed14f"
SRC_URI[sha256sum] = "d69b553ecb6f54a680c781a208b11dc4967373196d498a1845dfbb557e4ffe79"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_mission_executor-0.1.5-0"

inherit ament
