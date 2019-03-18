# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Theora_image_transport provides a plugin to image_transport for     transparently sending an image stream encoded with the Theora codec."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " builtin-interfaces cv-bridge image-transport libogg libtheora pluginlib rclcpp rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/image_transport_plugins-release/archive/release/crystal/theora_image_transport/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "431dd0b280f7590bcc5863072148832d"
SRC_URI[sha256sum] = "748543b146e6a8816a560c6ccf5a48c9648c0b1b6a956cd3e7c67390ee4e2d2c"
S = "${WORKDIR}/image_transport_plugins-release-release-crystal-theora_image_transport-2.0.0-0"

inherit ament
